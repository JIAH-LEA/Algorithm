package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ20413 {
    public static void main( String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        // 등급 기준액 input 받기
        int[] stand = new int[4];
        st = new StringTokenizer(br.readLine(), " ");
        for( int i = 0; i < 4; i++ ) {
            stand[i] = Integer.parseInt(st.nextToken());
        }
        // 등급 input 입력 받기
        String str = br.readLine();
        char[] ranks = str.toCharArray();

        int sum = 0; // 최대 누적 합
        int prev = 0; // 바로 직전 점수
        // rank에 따라 점수 누적하기
        for( char rank : ranks) {
            if(rank=='D') {
                sum += stand[3];
            }
            else if(rank=='B') {
                prev = (stand[0]-1)-prev;
                sum += prev;
            }
            else if(rank=='S') {
                prev = (stand[1]-1)-prev;
                sum += prev;
            }
            else if(rank=='G') {
                prev = (stand[2] - 1) - prev;
                sum += prev;
            }
            else if(rank=='P') {
                prev = (stand[3] - 1) - prev;
                sum += prev;
            }

        }
        System.out.println(sum);
    }
}
