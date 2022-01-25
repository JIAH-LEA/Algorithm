package AlgorithmChallenge;

public class multiDemension {

    public static void main(String[] args) {

        Integer[][][] data_list = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                }
        };

        // 데이터 5 인덱스로 지정해서 출력해보기
        System.out.println(data_list[0][1][1]);
        // 데이터 12 인덱스로 지정해서 출력해보기
        System.out.println(data_list[1][1][2]);
    }
}