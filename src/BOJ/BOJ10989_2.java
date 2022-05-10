package BOJ;

// 10989 - 수 정렬하기3
// 실버5 - 정렬(카운팅 정렬)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10989_2 {
    public static void main( String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 수의 범위 (10,000보다 작거나 같은 자연수 *0은 제외)
        int[] cnt = new int[10001];
        int N = Integer.parseInt(br.readLine()); // 1 ≤ N ≤ 10,000,000
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            // 해당 인덱스의 값을 1 증가
            cnt[Integer.parseInt(br.readLine())] ++;
        }
        // 시간복잡도 : O(N+K) : 카운팅정렬
        for(int i = 1; i < 10001; i++){
            // i가 등장한 횟수가 0이 될 때 까지
            while(cnt[i] > 0){
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}
