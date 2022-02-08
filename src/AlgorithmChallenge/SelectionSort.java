package AlgorithmChallenge;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {

    public ArrayList<Integer> sort(ArrayList<Integer> dataList){

        int min;
        for( int stand = 0; stand < dataList.size()-1; stand++){
            min = stand;
            for( int index = stand+1; index < dataList.size(); index++) {
                if (dataList.get(index) < dataList.get(min))
                    min = index;

            }
            Collections.swap(dataList, min, stand);
            System.out.println(dataList);
        }
        return dataList;
    }

    public static void main(String[] args){

        ArrayList<Integer> testData = new ArrayList<Integer>();

        for( int i = 0; i < 10; i++)
            testData.add((int)(Math.random()*100));

        SelectionSort sSort = new SelectionSort();
        sSort.sort(testData);

    }

}
