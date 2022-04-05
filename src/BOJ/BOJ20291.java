package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;


public class BOJ20291 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // key 값을 기준으로 정렬을 해주는 TreeMap 사용
        Map<String, Integer> map = new TreeMap<>();

        for( int i = 0; i < N; i++) {
            String fileName = br.readLine();
            // '.'을 기준으로 뒤 값을 파싱해서 확장자를 얻는다
            String extension = fileName.substring(fileName.indexOf(".") + 1);

            // 해당 확장자가 이미 있다면 val+1
            if(map.containsKey(extension)) {
                map.put(extension, map.get(extension) + 1);
            }
            // 없다면 map에 val(1) 과 함께 넣어준다.
            else
                map.put(extension, 1);
        }

        // map의 key Set<> 을 돌면서 key 값과 val 값을 출력한다
        for( String key : map.keySet())
            System.out.println(key + " " + map.get(key));

    }
}
