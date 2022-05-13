package BOJ;

// 5525 - IOIOI
// 실버1 - 문자열
// 50점 - java8에서 repeat 컴파일에러남

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String standard = "IO".repeat(N)+"I"; // 기준 문자열 생성
        int cnt=0;
        for(int i = 0; i < str.length(); i++ ) {
            if(str.charAt(i)=='I' && i <= str.length()-(N*2+1)){
                String subStr = str.substring(i,i+(N*2)+1);
                if(subStr.equals(standard))
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}
