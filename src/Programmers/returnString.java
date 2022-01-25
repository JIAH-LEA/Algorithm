package Programmers;

public class returnString {
    public String solution(int n) {
        String answer = "";
        for(int i=1; i<=n; i++){
            if(i%2==1)
                answer+="수";
            else
                answer+="박";
        }
        return answer;
    }

    public static void  main(String[] args){
       returnString wm = new returnString();
        System.out.println("n이 3인 경우: " + wm.solution(3));
        System.out.println("n이 4인 경우: " + wm.solution(4));
    }
}
