package BOJ;

// 2751 - 수 정렬하기2
// 실버5 - 정렬

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ2751 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for( int i = 0; i < N; i++ ) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr); // TimSort(O(N)-O(NlogN)

        for(int value : arr){
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
