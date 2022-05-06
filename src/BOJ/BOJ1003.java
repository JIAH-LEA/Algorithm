package BOJ;

// 1003 - 피보나치 함수
// 실버3 - DP

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1003 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dp[][] = new int[41][2]; // n의 범위가 40까지

        dp[0][0] = 1; // 0일 때 0의 개수
        dp[0][1] = 0; // 0일 때 1의 개수
        dp[1][0] = 0; // 1일 때 0의 개수
        dp[1][1] = 1; // 1일 때 1의 개수

        // 니머지 n일때 0과1의 개수에 대한 점화식 계산
        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }

        // 입력 받아 출력
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            System.out.print(dp[num][0]+" "+dp[num][1]+"\n");
        }
    }
}
