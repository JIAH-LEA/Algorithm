package BOJ;

// 10841 - 나이순정렬
// 실버5 - 정렬

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ10841 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] list = new String[N][2];
        StringTokenizer st;

        for( int i = 0; i < N; i++ ) {
            st = new StringTokenizer(br.readLine());
            list[i][0] = st.nextToken();
            list[i][1] = st.nextToken();
        }

        Arrays.sort(list, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        StringBuilder sb = new StringBuilder();
        for( int i = 0; i < N; i++ ) {
            sb.append(list[i][0]).append(' ').append(list[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}
