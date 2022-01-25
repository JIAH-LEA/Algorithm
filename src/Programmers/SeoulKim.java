package Programmers;

public class SeoulKim {
    // 실행을 위한 테스트코드입니다.
    public static void main(String[] args) {
        SeoulKim kim = new SeoulKim();
        String[] names = {"Queen", "Tod","Kim"};
        System.out.println(kim.Solution(names));
    }
    public String Solution(String[] seoul){
       int x=0;
       while(x<seoul.length){
           if(seoul[x].equals("kim"))
               break;
           else
               x++;
       }
       return "김서방은"+x+"에 있다.";
    }
}
