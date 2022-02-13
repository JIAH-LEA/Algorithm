package CodingTestSKP;
import java.util.*;

class Solve2 {
    public static int[] solution(int[] deposit) {

        Stack<Integer> bankBook = new Stack<>();

        for (int i = 0; i < deposit.length; i++) {
            if (deposit[i] > 0) {
                bankBook.push(deposit[i]);
            }else {
                int remain = bankBook.peek();
                if (remain >= Math.abs(deposit[i])) {
                    bankBook.push(bankBook.pop() + deposit[i]);
                }else{
                    deposit[i] += remain;
                    bankBook.pop();
                    int current = bankBook.pop();
                    while (current < Math.abs(deposit[i])) {
                        current += bankBook.pop();
                    }
                    if (current >= Math.abs(deposit[i])) {
                        bankBook.push(current + deposit[i]);
                    }
                }
            }
        }
        List<Integer> toAnswer = new ArrayList<>();
        for (int i : bankBook) {
            if (i != 0) {
                toAnswer.add(i);
            }
        }
        int[] answer = toAnswer.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}