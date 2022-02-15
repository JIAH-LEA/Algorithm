package AlgorithmChallenge;

import java.util.ArrayList;
import java.util.Arrays;

public class Split {

    public boolean splitFunc(ArrayList<Integer> dataList){
        if(dataList.size() <= 1){
            return false;
        }
        int pivot = dataList.get(0);

        ArrayList<Integer> leftArr = new ArrayList<Integer>();
        ArrayList<Integer> rightArr = new ArrayList<Integer>();

        for(int index = 1; index < dataList.size(); index++ ){
            if(dataList.get(index) > pivot)
                rightArr.add(dataList.get(index));
            else
                leftArr.add(dataList.get(index));
        }

        ArrayList<Integer> mergedArr = new ArrayList<Integer>();
        mergedArr.addAll(leftArr);
        mergedArr.addAll(Arrays.asList(pivot));
        mergedArr.addAll(rightArr);


        System.out.println(mergedArr);


        return false;

    }

    public static void main(String[] args){
        Integer[] array = {4,1,2,5,7};
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
        Split sObject = new Split();
        System.out.println(sObject.splitFunc(list));
    }
}
