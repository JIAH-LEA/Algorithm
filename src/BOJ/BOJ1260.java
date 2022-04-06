package BOJ;

// 1260 - DFS 와 BFS
// 실버2 - 그래프 탐섹, DFS, BFS

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1260 {

    static boolean[] check;
    static ArrayList<Integer>[] list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 정점의 개수
        int m = Integer.parseInt(st.nextToken()); // 간선의 개수
        int v = Integer.parseInt(st.nextToken()); // 시작 할 정점

        // 인접리스트 배열 생성
        list = new ArrayList[n+1];
        for( int i = 1; i < n+1; i++ ) {
            list[i] = new ArrayList<>();
        }
        for ( int i = 0; i < m; i++ ) {
            st = new StringTokenizer(br.readLine());
            int e1 = Integer.parseInt(st.nextToken());
            int e2 = Integer.parseInt(st.nextToken());
            list[e1].add(e2);
            list[e2].add(e1);
        }
        // 인접리스트 내 정렬
        for (int i = 1; i < n + 1; i++) {
            Collections.sort(list[i]);
        }

        check = new boolean[n+1];
        dfs(v);
        System.out.println();
        check = new boolean[n+1];
        bfs(v);
    }
    // DFS : 재귀함수 이용
    static void dfs(int v) {
        if (check[v])
            return;
        // 현재 정점 방문 처리
        check[v] = true;
        System.out.print(v + " ");
        // 연결된 다른 정점 재귀적으로 방문
        for(int vertex : list[v]) {
            if(!check[vertex])
                dfs(vertex);
        }
    }
    // BFS : Queue 이용
    static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        // 현재 정점 방문 처리
        queue.add(v);
        check[v]= true;
        // Queue가 빌 때까지
        while(!queue.isEmpty()) {
            // Queue에서 정점 한 개 출력
            int poll = queue.poll();
            System.out.print(poll + " ");
            // 정점과 연결된 정점 방문, 큐에 삽입
            for( int vertex : list[poll] ) {
                if (!check[vertex]){
                    check[vertex] = true;
                    queue.add(vertex);
                }
            }
        }

    }

}
