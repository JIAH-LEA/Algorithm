package Programmers;

class SumBetween {
    public static void main(String[] args) {
        SumBetween s = new SumBetween();
        System.out.println(s.sumof(3, 5));
    }

    public long sumof(int a, int b) {
        long answer = 0;
        if (a == b)
            return a;

        else if (a < b) {
            for (int i = a; i <= b; i++)
                answer += i;
        } else {
            for (int i = b; i <= a; i++)
                answer += i;
        }
        return answer;
    }
}

