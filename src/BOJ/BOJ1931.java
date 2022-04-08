package BOJ;

// 1931 - 회의실배정
// 실버2 - 그리디 알고리즘, 정렬
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1931 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        TimeChart[] timeList = new TimeChart[n]; // 시간표 배열 생성

        for( int i = 0; i < n; i++ ) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            timeList[i] = new TimeChart(start, end);
        }
        // 시간표 정렬 ( 종료 시간 기준)
        Arrays.sort(timeList);

        int endTime = timeList[0].end;
        int count = 1;

        // 종료 시점을 기준으로 해당 종료 시점보다 시작 시점이 뒤에 있는 시간을 Count
        for( int i = 1; i < timeList.length; i++ ) {
            if(endTime <= timeList[i].start) {
                endTime = timeList[i].end;
                count += 1;
            }
            else
                continue;
        }

        System.out.println(count);

    }

}

// 시작, 종료 시간 Class
class TimeChart implements Comparable<TimeChart> {

    int start;
    int end;

    TimeChart(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(TimeChart other) {
        // 종료시점이 같으면, 시작시점이 작은게 먼저
        if(this.end == other.end)
            return this.start - other.start;
        return this.end - other.end; // 오름차순 정렬
    }
}
