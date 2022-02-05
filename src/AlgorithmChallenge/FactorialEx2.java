package AlgorithmChallenge;

public class FactorialEx2 {

    public int factorialFunc( int n ){
        if(n > 1){
            return n * factorialFunc(n-1); // 재귀함수 사용 공간복잡도 O(n)
        }else
            return 1;
    }

    public static void main(String[] args){
        FactorialEx1 factorial = new FactorialEx1();
        factorial.factorialFunc(5);
    }
}
