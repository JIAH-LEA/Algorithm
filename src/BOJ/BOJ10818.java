package BOJ;

// 10818 - 최소, 최대
// 브론즈3 - 수학, 구현
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10818 {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int b = Integer.parseInt(st.nextToken());
            int min = b;
            int max = b;

            // min, max 비교
            for(int i = 0; i < n - 1; i++) {
                int a = Integer.parseInt(st.nextToken());
                if (min > a)
                    min = a;
                if (max < a)
                    max = a;
            }

            System.out.print(min + " " + max);
        }
    }

