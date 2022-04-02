package BOJ;

import java.util.Scanner;

public class BOJ9498{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int score;
        score = scan.nextInt();

        if(score<=100 && score>=90)
            System.out.print("A");
        else if(score<=89 && score>=80)
            System.out.print("B");
        else if(score<=79 && score>=70)
            System.out.print("C");
        else if(score<=69 && score>=60)
            System.out.print("D");
        else
            System.out.print("F");

        scan.close();
    }
}