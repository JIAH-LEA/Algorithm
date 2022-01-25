package Programmers;

import java.util.List;

public class Inversions {
        public static long maxInversions(List<Integer> arr) {
            long result = 0;
            for(int i=0; i < arr.size()-1; i++) {
              int minValue = 0;
              for(int j=i+1; j<arr.size() - 1; j++) {
                if(arr.get(i) > arr.get(j)) {
                  minValue++;
               }
            }
            
            int maxValue =0;
            for (int j=i-1; j >= 0; j--) {
                if(arr.get(i) < arr.get(i)){
                    maxValue++;
                }
             }
             
             result += maxValue * minValue;
          }
          return result;
        }
        
    }
