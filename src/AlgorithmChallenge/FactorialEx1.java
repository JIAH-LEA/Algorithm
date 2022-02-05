package AlgorithmChallenge;

public class FactorialEx1 {

    public int factorialFunc( int n ){
        int fac = 1;
        for(int index  =2; index < n + 1; index++){
            fac = fac * index;
        }
        return fac;
    }

    public static void main(String[] args){
        FactorialEx1 factorial = new FactorialEx1();
        factorial.factorialFunc(5);
    }
}
