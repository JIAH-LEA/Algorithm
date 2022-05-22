package BOJ;

// 2805 - 나무자르기
// 실버3 - 이분탐색

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2805 {
    public static void main(String[] args) throws IOException {
        // 1. 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] trees = new int[N];
        st = new StringTokenizer(br.readLine());

        for( int i = 0; i < N; i++ ) {
            trees[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(trees); // 이거 안하는게 시간복잡도 더 적게 걸리기는 함
        int max = trees[N-1];
        int min = 0;

        // 2. 이분탐색 이용하기
        while ( min <= max ) {
            long sum = 0;
            int mid = (min + max) / 2;
            // 가져갈 수 있는 나무 합 구하기
            for(int i = trees.length-1; i >= 0 ;i--) {
                if(trees[i]-mid>=0)
                    sum += trees[i] - mid;
                else
                    break;
            }
            if( sum > M )
                    min = mid + 1;
            else if ( sum < M )
                max = mid - 1;
            else{
                System.out.println(mid);
                return;
            }
        }
        System.out.println(max);

    }
}
