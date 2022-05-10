package BOJ;

// 10989 - 수 정렬하기3
// 실버5 - 정렬(Arrays.sort)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10989 {
    public static void main( String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 1 ≤ N ≤ 10,000,000
        int[] arr = new int[N];
        StringBuilder sb = new StringBuilder();

        for( int i = 0; i < N; i++ ) {
            arr[i] = Integer.parseInt(br.readLine()); //  10,000보다 작거나 같은 자연수
        }

        Arrays.sort(arr); // 평균: O(NlogN) 최악: O(N^2)

        for( int i = 0; i < N; i++ ) {
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);
    }
}
