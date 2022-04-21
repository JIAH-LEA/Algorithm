package BOJ;

// 10809 - 알파벳 찾기
// 브론즈2 - 구현 문자열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10809 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26]; //알파벳 배열

        //배열 초기화
        for( int i = 0; i < arr.length; i++ ) {
            arr[i] = -1;
        }

        String given = br.readLine();

        for( int i = 0; i < given.length(); i++ ) {
            char ch = given.charAt(i);
            // 처음 등장한 알파벳인 경우(값이 -1) -> 해당 인덱스 넣어주기
            if(arr[ch-'a'] == -1)
                arr[ch-'a'] = i;
        }
        // 정답 배열 출력
        for(int num : arr){
            System.out.println(num + " ");
        }
    }
}
