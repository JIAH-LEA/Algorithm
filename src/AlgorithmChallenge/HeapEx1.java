package AlgorithmChallenge;

import java.util.ArrayList;
import java.util.Collections;

public class HeapEx1 {

    public ArrayList<Integer> heapArray = null;

    public HeapEx1(Integer data){
        heapArray = new ArrayList<Integer>();

        heapArray.add(null);  // 0번 인덱스에는 null 넣기
        heapArray.add(data);
    }

    public boolean moveUp(Integer insertIdx){
        if(insertIdx <= 1)
            return false;

        Integer parentIdx = insertIdx/2;

        if(this.heapArray.get(insertIdx) > this.heapArray.get(parentIdx))
            return true;
        else
            return false;
    }

    public boolean insert(Integer data){

        Integer insertIdx, parentIdx;

        // 힙에 데이터가 없을 때
        if(heapArray == null){

            heapArray = new ArrayList<Integer>();

            heapArray.add(null);
            heapArray.add(data);
            return  true;
        }

        this.heapArray.add(data);
        insertIdx = this.heapArray.size()-1;

        while(this.moveUp(insertIdx)){
            parentIdx = insertIdx/2;
            Collections.swap(this.heapArray,insertIdx,parentIdx);
            insertIdx = parentIdx;
        }
        return  true;


    }

    public static void main ( String[] args ){

        HeapEx1 heapTest = new HeapEx1(15);
        heapTest.insert(10);
        heapTest.insert(8);
        heapTest.insert(5);
        heapTest.insert(4);
        heapTest.insert(20);

        System.out.println(heapTest.heapArray); // [null, 20, 10, 15, 5, 4, 8]

    }

}
