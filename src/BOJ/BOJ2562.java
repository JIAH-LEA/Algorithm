package BOJ;

import java.io.*;

public class BOJ2562 {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int maxIdx = 0;
        int maxData = 0;

        for( int i = 0; i < 9; i++ ) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for( int k = 0; k < 9; k++ ) {
            if(arr[k] > maxData) {
                maxData = arr[k];
                maxIdx = k+1;
            }
        }

        System.out.println(maxData);
        System.out.println(maxIdx);


    }
}