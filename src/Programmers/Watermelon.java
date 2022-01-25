package Programmers;

public class Watermelon {
    public static void main(String[] args) {
        Watermelon wm = new Watermelon();
        System.out.println("n이 3인 경우: " + wm.watermelon(3));
        System.out.println("n이 4인 경우: " + wm.watermelon(4));
    }

    public String watermelon(int n) {
        //answer=""가 내 원 코드였는데  StringBuilder 활용하지 못함
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1)
                //answer +="수"했는데 string 이니 append로
                answer.append("수");
            else
                answer.append("박");
        }
        return answer.toString();
    }
}



