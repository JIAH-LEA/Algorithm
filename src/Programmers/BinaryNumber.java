package Programmers;

public class BinaryNumber {

  public static long getNumber(SingleyLinkedListNode binary){

     long result = 0;
     while(binary != null) {
       result = (result*2) + binary.data;
       binary = binary.next;
     }
     return result;

  }
}
