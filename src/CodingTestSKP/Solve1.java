package CodingTestSKP;

import java.util.Arrays;

class Solve1 {
    public int solution(int[] t, int m) {
        int answer = 0;

        Arrays.sort(t);
        for( int i = 0; i < m; i++)
            answer += t[i];

        answer = answer + m ;

        return answer;

    }
}