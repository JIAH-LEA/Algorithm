package AlgorithmChallenge;

public class Factorial{

    public int factorialFunc(int n){

        if(n>1){
            return n*factorialFunc(n-1);
        }else
            return 1;
    }

    public static void main(String[] args){
        Factorial fObject = new Factorial();
        System.out.println(fObject.factorialFunc(5));
    }
}