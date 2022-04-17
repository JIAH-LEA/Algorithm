package BOJ;

// 1181 - 단어 정렬
// 실버4 - 정렬, 문자열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ1181 {

    public static void main(String[] args) throws IOException {
        // 1. 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        // 2. 조건에 맞게 정렬하기
        Arrays.sort(arr, new Comparator<>() {
            @Override
            public int compare(String me, String other) {
                // 길이 같은 경우 사전순 정렬
                if (me.length() == other.length())
                    return me.compareTo(other);
                    // 길이 다를 경우 길이 순 정렬
                else
                    return me.length() - other.length();
            }
        });

        // 3. 출력하기
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append('\n');
        for (int i = 1; i < N; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                sb.append(arr[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
}
