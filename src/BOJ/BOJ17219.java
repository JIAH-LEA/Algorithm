package BOJ;

// 17219 - 비밀번호 찾기
// 실버4 - 자료구조, 해시를 사용한 집합과 맵

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ17219 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 사이트와 비밀번호 집합을 위한 저장 구조 선언
        Map<String, String> pwdSet = new HashMap<>();

        // 1. 사이트와 비밀번호 입력
        for( int i = 0; i < N; i++ ) {
            st = new StringTokenizer(br.readLine(), " ");
            pwdSet.put(st.nextToken(), st.nextToken());
        }

        // 2. 확인하고자 하는 사이트 Key 검색 후 출력
        StringBuilder sb = new StringBuilder();
        for( int i = 0; i < M; i++ ) {
            String key = br.readLine();
                if(pwdSet.containsKey(key)){ // 해당 키(사이트)가 있으면, 비밀번호를 반환(.get(key))
                    sb.append(pwdSet.get(key)).append('\n');
                }
        }
        System.out.println(sb);
    }
}
