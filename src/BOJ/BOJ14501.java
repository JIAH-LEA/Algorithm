package BOJ;

// 14501 - 퇴사
// 실버3 - 브루트포스, 다이나믹프로그래밍

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        int[] dp = new int[N+1];
        int max =0;
        for( int i = 0; i < N; i++ ) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for( int i = N-1; i >=0; i-- ) {
            // 퇴사일보다 많이 걸리면 쓸 수 없음
            if( i+arr[i][0] > N )
                 dp[i] = max ;
            // 퇴사일 범위 내라면, max와 현재+현재 이후 일 가능한 시간의 dp값을 비교
            else {
                dp[i] = Math.max(arr[i][1] + dp[arr[i][0] + i], max);
                max = dp[i];
            }
        }

        System.out.println(dp[0]);

    }
}
