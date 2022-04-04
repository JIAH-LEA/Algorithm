package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14719 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        int[] block = new int[W];

        st = new StringTokenizer(br.readLine());

        // 각 block 별 높이 입력 받기
        for( int i = 0; i < W; i++){
            block[i] = Integer.parseInt(st.nextToken());
        }

        int left, right, result;
        result = 0;

        // 첫번째와 마지막을 제외하고 각 블록 별 모이는 빗물의 양 계산
        for( int j = 1; j < W-1; j++ ) {
            left = right = 0;

            // 각 block 기준 왼쪽의 max와 오른쪽의 max 값 중 min 값 만큼의 양이 채워진다
            for( int k = 0; k < j; k++ ) {
                left = Math.max(block[k], left);
            }

            for( int k = j+1; k < W; k++ ) {
                right = Math.max(block[k], right);
            }

            int last = Math.min(left, right);

            // 단, 해당 block 보다 그 값이 커야지만 물이 채워 질 수 있다
            if( block[j] < last )
                result += (last - block[j]);

        }

        System.out.println(result);
    }
}


