package AlgorithmChallenge;

public class FibonacciRecursive {

    public int recursiveFunc(int data){

        if ( data <= 1 )
            return data;

        return this.recursiveFunc(data-1 ) + this.recursiveFunc(data-2 );
    }
}
