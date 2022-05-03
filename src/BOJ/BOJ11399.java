package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 11399 - ATM
// 실버3 - 정렬, 그리디 알고리즘
public class BOJ11399 {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] time = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for( int i = 0; i < N; i++ ) {
            time[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time);

        for( int i = 0; i < N; i++ ) {
            answer += sum += time[i];
        }
        System.out.println(answer);

    }

}
