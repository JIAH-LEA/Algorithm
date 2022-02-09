package CodingTestSKP;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class MaxSum {
    public static int findMaxSum(List<Integer> list) {
        Collections.sort(list);
        int lastIdx = list.size()-1;
        return list.get(lastIdx) + list.get(lastIdx-1); //timeLimit fail 걸림
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 9, 7, 11);
        // Should return 20, since 9 and 11 are the largest elements
        // and their sum is 20
        System.out.println(findMaxSum(list));
    }
}
