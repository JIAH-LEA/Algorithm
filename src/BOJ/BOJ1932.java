import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1932 {
	public static int N;
	public static int[][] t;
	public static int[][] d;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		N = Integer.parseInt(br.readLine());
		
		t = new int[N + 1][N + 1];
		d = new int[N + 1][N + 1];
		
		for (int i = 1; i <= N; ++i) {
			st = new StringTokenizer(br.readLine(), " ");
			
			for (int j = 1; j <= i; ++j) {
				t[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 1; i <= N; ++i) {
			for (int j = 1; j <= i; ++j) {
				d[i][j] = Math.max(d[i - 1][j], d[i - 1][j - 1]) + t[i][j];	
			}
		}
		
		int answer = 0;
		for (int i = 1; i <= N; ++i) {
			answer = (answer < d[N][i]) ? d[N][i] : answer;
		}
		
		System.out.println(answer);
	}
}
