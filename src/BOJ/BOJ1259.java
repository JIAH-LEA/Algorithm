package BOJ;

// 1259 - 펠린드롬수
// 브론즈1 - 문자열, 구현

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1259 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        while(true){
            String str = br.readLine();
            if(str.equals("0"))
                break;
            if(isPalin(str))
                sb.append("yes").append('\n');
            else
                sb.append("no").append('\n');
        }
        System.out.print(sb.toString());
    }

    private static boolean isPalin(String str) {
        for(int i=0; i<=str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-(i+1)))
                return false;
        }
        return true;
    }
}
