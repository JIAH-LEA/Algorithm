package Programmers;

import java.util.*;

public class Immigration {
    public static long immigration(int n, int[] times) {

        long answer = 0;
        
        Arrays.sort(times); 
        
        long left = 1; // 최소 소요 시간 
        long right = times[times.length-1] * n; // 최대 소요 시간

        while(left <= right) {
        
            long people = 0; // 심사한 사람의 수 
            long mid = (left + right) / 2 ; 
            
            // mid 시간이 걸릴 때 검사 가능한 사람의 수
            for(int time : times) { 
                people += mid / time ;
            }
            
            // 현재 mid보다 더 많은 시간이 소요됨을 의미
            if(people < n) 
                left = mid + 1;
            // 현재 mid와 같거나 적은 시간이 소요됨을 의미 
            else {
                right = mid - 1;
                answer = mid;
            }
                
        }
        return answer;
    }
}
