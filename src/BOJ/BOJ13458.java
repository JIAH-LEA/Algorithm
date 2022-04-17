package BOJ;

// 13458 - 시험 감독
// 브론즈2 - 수학, 구현

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ13458 {

    public static void main( String[] args ) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 시험장 별 응시 인원 배열 입력
        int[] arr = new int[N];
        for( int i = 0; i < N; i++ ) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        // 필요 최소 감독관 수 (long타입)
        long count = N; // 총감독관은 1명씩 모든 시험장에 필요

        // 몫과 나머지를 이용하여 필요한 최소 감독관 수 구하기
        for( int i = 0; i < N; i++ ) {
            int remain = arr[i] - B;
            if( remain > 0 ) {
                count += remain / C;
                if( remain % C != 0 )
                    count++;
            }
        }
        System.out.println(count);
    }
}