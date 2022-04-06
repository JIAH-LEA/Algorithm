package Programmers;
import java.util.*;

// 완전탐색 - 모의고사(Level1)
class MockTest {
    public int[] mockTest(int[] answers) {

        int[] stu1 = {1,2,3,4,5};
        int[] stu2 = {2,1,2,3,2,4,2,5};
        int[] stu3 = {3,3,1,1,2,2,4,4,5,5};

        // 정답 수 카운트
        int[] count = new int[3];
        for ( int i = 0; i < answers.length; i++ ) {
            if(answers[i] == stu1[i%5])
                count[0]++;
            if(answers[i] == stu2[i%8])
                count[1]++;
            if(answers[i] == stu3[i%10])
                count[2]++;
        }

        // 최대값 구하기
        int maxScore = Math.max(count[0], Math.max(count[1], count[2]));
        // 최대값 가진 학생을 list에 넣어준다
        ArrayList<Integer> arr = new ArrayList<>();
        if(maxScore == count[0])
            arr.add(1);
        if(maxScore == count[1])
            arr.add(2);
        if(maxScore == count[2])
            arr.add(3);
        // ArrayList -> Array 변환
        int[] answer = new int[arr.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr.get(i);
        }

        return answer;
    }
}