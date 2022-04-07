package BOJ;

// 2407 - 조합
// 실버3 - 임의정밀도, 큰 수 연산, DP, 조합론, 수학

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ2407 {

    static BigInteger[][] dp = new BigInteger[101][101]; // 1-100까지 인덱스 사용

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        dynamicFunc(); // 해당 조합 범위의 파스칼 삼각형 만들기
        System.out.println(dp[n][m]); // 원하는 값 추출
    }
    // 재귀 방식 시간초과 > 파스칼 삼각형 이용
    static void dynamicFunc() {

        dp[1][0] = dp[1][1] = BigInteger.ONE; // 1C0 = 1C1 = 1
        for( int i = 0; i < 101; i++ ) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0)
                    dp[i][j] = BigInteger.ONE; // iC0 = iCi = 1
                else
                    dp[i][j] = dp[i - 1][j].add(dp[i - 1][j - 1]); // iCj = i-1Cj + i-1Cj-1
            }
        }
    }
}