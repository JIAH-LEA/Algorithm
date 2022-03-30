package BOJ;

// BOJ 11652 - 카드
// 정렬 - 실버4

import java.io.*;
import java.util.Arrays;

public class BOJ11652 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);

        long max = arr[0];
        int maxCount = 1;
        int currentCount = 1;

        for (int k = 1; k < N; k++) {
            if (arr[k] == arr[k - 1])
                currentCount++;
            else
                currentCount = 1;
            if (currentCount > maxCount) {
                max = arr[k];
                maxCount = currentCount;
            }
        }

        System.out.println(max);
    }

}