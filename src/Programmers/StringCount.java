package Programmers;

public class StringCount {

    boolean countstring(String s) {
        s = s.toUpperCase();
        //s.length()를 변수 선언해주니 런타임 에러가 났다 *불필요한 짓 금지*
        int  pCount = 0, yCount = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'P':
                    pCount++;
                    break;
                case 'Y':
                    yCount++;
                    break;
                default:
                    break;
            }
        }
        // return pCount==yCount?true:false;(불필요했던 나의 원코드)
        return pCount == yCount;
    }

    //test code
    public static void main(String[] args) {
        StringCount s = new StringCount();
        System.out.println(s.countstring("Hello java"));
    }
}