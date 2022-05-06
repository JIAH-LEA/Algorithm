package BOJ;

// 1764 - 듣보잡
// 실버3 - 자료구조, 문자열, 정렬, 해시(집합과 맵)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ1764 {
    static ArrayList<String> answer = new ArrayList<>(); // 듣도보도 못한 사람 넣는 배열
    static HashSet<String> match = new HashSet<>(); // 듣도 못한 사람을 위한 HashSet
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 듣도 못한 사람 HashSet에 입력
        for( int i = 0; i < N; i++ ) {
            match.add(br.readLine());
        }
        // 보도 못한 사람 입력 받아 듣도 못한 사람에 있다면 답 배열에 삽입
        for( int i = 0; i < M; i++ ) {
            String noLook = br.readLine();
            if(match.contains(noLook))
                answer.add(noLook);
        }
        // 정렬하기
        Collections.sort(answer);
        // 출력하기
        System.out.println(answer.size());
        for (String s : answer) {
            System.out.println(s);
        }
    }
}
