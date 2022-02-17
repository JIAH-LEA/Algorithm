package AlgorithmChallenge;

import java.util.ArrayList;

public class SequentialSearch {

    public int searchFunc(ArrayList<Integer> dataList, Integer searchItem){
        for( int index = 0; index < dataList.size(); index++){
            if(dataList.get(index) == searchItem)
                return index;
        }
        return -1;
    }

    public static void main(String[] args){

        SequentialSearch sequentialSearch = new SequentialSearch();

        ArrayList<Integer> testData = new ArrayList<>();
        for(int i =0; i<10; i++) {
            testData.add((int) (Math.random() * 100));
        }
        sequentialSearch.searchFunc(testData, 99);
    }
}
