package Programmers;

public class calendar2016 {
    public String getDay(int a, int b){
        String answer;
        String[] day={"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] dateOfMonth={31,29,31,30,31,30,31,31,30,31,30,31};
        int sumOfDate=0;
        for(int i=0; i<a-1 ;i++)
            sumOfDate+=dateOfMonth[i];
        sumOfDate += b-1;
        answer =day[sumOfDate%7];
        return answer;
    }
}
