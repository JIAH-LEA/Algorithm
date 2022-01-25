package Programmers;

public class EvenOdd {
    public String evenOdd(int num) {
        String answer = "";
        if(num%2==0)
            answer="Even";
        else
            answer="Odd";
        return answer;
    }
}
