package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1157 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        int[] alpha = new int[26];

        for(  int i = 0; i < str.length(); i++ ) {
            int num = str.charAt(i)-65;
            alpha[num]++;
        }
        int count = alpha[0];
        int maxIdx = 0;
        char result = 0;

        for( int i = 0; i < alpha.length; i++) {
                if( alpha[i] > count ) {
                    count = alpha[i];
                    maxIdx = i;
                }
        }

        for( int i = 0; i < alpha.length; i++ ) {
            if( count == alpha[i] && maxIdx != i) {
                result = '?';
                break;
            }
            else
                result = (char)(maxIdx+65);
        }

        System.out.print(result);

    }
}
