package BOJ;

// 9095 - 1, 2, 3 더하기
// 실버3 - DP

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9095 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T];

        for( int i = 0; i < arr.length; i++ ) {
            arr[i]= Integer.parseInt(br.readLine());
        }
        // 입력값 출력
        for( int n : arr) {
            System.out.println(oneTwoThree(n));
        }

    }

    // 점화식 함수
    public static int oneTwoThree(int n){
        if(n==1)
            return 1;
        else if(n==2)
            return 2;
        else if(n==3)
            return 4;
        else
            return oneTwoThree(n-1)+oneTwoThree(n-2)+oneTwoThree(n-3);
    }
}
