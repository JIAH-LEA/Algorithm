package Programmers;
import java.util.*;

// 해시 - 전화번호 목록(LV.2)
class PhoneBook {
    public boolean solution(String[] phone_book) {

        Map<String,Integer> map = new HashMap<>();
                
        for( int index = 0; index < phone_book.length; index++ ) {
            map.put(phone_book[index] , index);
        }
        
        for( String phone_number : phone_book ) {
            for( int j = 1; j < phone_number.length(); j++ ) {
                if(map.containsKey(phone_number.substring(0,j)))
                   return false;
            
        
            }
        }
        return true;
                    
    }
}
