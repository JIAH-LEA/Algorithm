package BOJ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DFS2667 {

        static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        static int n;
        static int[][] arr;
        static boolean[][] check;
        static StringBuilder sb = new StringBuilder();

        public static void main(String[] args) throws IOException {
            n = Integer.parseInt(br.readLine());
            arr = new int[n + 1][n + 1];
            check = new boolean[n + 1][n + 1];
            List<Integer> list = new ArrayList<>();

            for(int i = 1; i <= n; i++){
                String input = br.readLine();
                for(int j = 1; j <= n; j++){
                    arr[i][j] = input.charAt(j - 1) - '0';
                }
            }

            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    if(checkLocation(i, j)) {
                        int val = dfs(i, j);
                        list.add(val);
                    }
                }
            }

            Collections.sort(list);
            sb.append(list.size() + "\n");
            for(int num : list) sb.append(num + "\n");

            System.out.println(sb);
        }
        public static int dfs(int x, int y){
            // 단지 별 집의 개수
            int val = 1;
            check[x][y] = true;

            // '상'의 좌표
            if(checkLocation(x - 1, y)) val += dfs(x - 1, y);
            // '우'의 좌표
            if(checkLocation(x, y + 1)) val += dfs(x, y + 1);
            // '하'의 좌표
            if(checkLocation(x + 1, y)) val += dfs(x + 1, y);
            // '좌'의 좌표
            if(checkLocation(x, y - 1)) val += dfs(x, y - 1);

            return val;
        }
        public static boolean checkLocation(int x, int y){
            if(x < 1 || x > n || y < 1 || y > n) return false;
            if(check[x][y] == true || arr[x][y] == 0) return false;
            return true;
        }
    }



