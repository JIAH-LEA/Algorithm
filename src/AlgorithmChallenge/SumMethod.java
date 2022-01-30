package AlgorithmChallenge;

public class SumMethod {

    public static int sumEach(int n){

        int total = 0;

        for(int i = 1; i <= n; i++){
            total += i;
        }
        return total;
    }

    public static int sumFormula(int n){

        return n*(n+1)/2;

    }

    public static void main(String[] args){

        System.out.println(sumEach(10));  //O(1)
        System.out.println(sumFormula(10));  //O(N)




    }
}
