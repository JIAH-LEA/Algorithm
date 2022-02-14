package AlgorithmChallenge;

import java.util.ArrayList;

public class MergeSort {
    public ArrayList<Integer> splitFunc(ArrayList<Integer> dataList){
        if(dataList.size() <= 1)
            return dataList;
        int medium = dataList.size() / 2;

        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();

        leftArr = splitFunc(new ArrayList<>(dataList.subList(0,medium-1)));
        rightArr = splitFunc(new ArrayList<>(dataList.subList(medium,dataList.size())));

        return mergeFunc(leftArr, rightArr);

    }

    public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftList, ArrayList<Integer> rightList){

        ArrayList<Integer> mergedList = new ArrayList<Integer>();

        int leftPoint = 0;
        int rightPoint = 0;

        //CASE 1: left / right 둘 다 있을 때
        while(leftList.size() > leftPoint && rightList.size() > rightPoint)
            if(leftList.get(leftPoint) > rightList.get(rightPoint)) {
                mergedList.add(rightList.get(rightPoint));
                rightPoint += 1;
            } else {
                mergedList.add(leftList.get(leftPoint));
                leftPoint += 1;

            }

        //CASE 2: right 데이터가 없을 때
        while(leftList.size() > leftPoint) {
            mergedList.add(leftList.get(leftPoint));
            leftPoint += 1;
        }

        //CASE 3: left 데이터가 없을 때
        while(rightList.size() > rightPoint) {
            mergedList.add(rightList.get(rightPoint));
            rightPoint += 1;
        }

        return mergedList;
    }

    public static void main(String[] args){

      ArrayList<Integer> testData = new ArrayList<Integer>();

      for(int index = 0; index < 100; index++){
          testData.add((int)(Math.random()*100));
      }

      MergeSort mSort = new MergeSort();
      System.out.println(mSort.splitFunc(testData));


    }

}
