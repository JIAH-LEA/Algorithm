package AlgorithmChallenge;

import java.util.ArrayList;
import java.util.Arrays;

public class GreedyCoin {
    public void coinFunc(Integer price, ArrayList<Integer> coinList) {

        Integer totalCoinCount = 0;
        Integer coinNum;
        ArrayList<Integer> details = new ArrayList<>();

        for (Integer integer : coinList) {
            coinNum = price / integer;
            totalCoinCount += coinNum;
            price -= coinNum * integer;
            details.add(coinNum);
            System.out.println(integer + "원" + coinNum + "개");
        }
        System.out.println("총 동전 갯수:" + totalCoinCount);

    }

    public static void main(String[] args){

        GreedyCoin greedyCoin = new GreedyCoin();
        ArrayList<Integer> coinList = new ArrayList<>(Arrays.asList(500, 100, 50, 1));
        greedyCoin.coinFunc(4720, coinList);
    }
}
