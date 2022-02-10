package AlgorithmChallenge;

import java.util.ArrayList;

public class FactorialSub {
    public int factorialFunc( ArrayList<Integer> dataList ){

        if( dataList.size() <= 0 )
            return 1;

        return dataList.get(0)
                 + this.factorialFunc(new ArrayList<Integer>(dataList.subList(1,dataList.size())));

    }

    public static void main( String[] args ){

        ArrayList testData = new ArrayList();

        for( int data = 0; data <10; data++)
            testData.add(data);

        FactorialSub fObject = new FactorialSub();
        fObject.factorialFunc(testData);

    }
}
