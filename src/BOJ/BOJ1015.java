package BOJ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Storage implements Comparable<Storage> {

    int num;
    int idx;

    Storage(int num, int idx) {
        this.num = num;
        this.idx = idx;
    }

    @Override
    public int compareTo(Storage other) {
        return this.num - other.num; // 비내림차순 정렬
    }
}


public class BOJ1015 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n =Integer.parseInt(br.readLine());
        Storage[] aArray = new Storage[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] pArray = new int[n];

        for( int i = 0; i < n; i++ ) {
            int aNum = Integer.parseInt(st.nextToken());
            aArray[i] = new Storage(aNum, i); // 배열 aArray의 num과 idx 함께 저장
        }

        Arrays.sort(aArray);

        for( int i = 0; i < n; i++ ) {
            pArray[aArray[i].idx] = i; //정렬한 aArray의 idx값을 받으면 pArray의 num값을 알 수 있음
        }

        for(int i = 0; i < n; i++ ) {
            sb.append(pArray[i]).append(' ');
        }
        System.out.println(sb);

    }

}
