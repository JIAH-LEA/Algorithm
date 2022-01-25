package Programmers;

public class CaesarCipher {
    public String Caesar(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //대소문자 구분 필요
            if (Character.isLowerCase(c)) {
                //대소문자가 각각 26개라서 나머지를 이용해서 순환구조를 만들었음
                c = (char) ((c + n % 26 - 'a') % 26 + 'a');
            } else if (Character.isUpperCase(c)) {
                c = (char) ((c + n % 26 - 'A') % 26 + 'A');
            }

            answer.append(c);
        }

        return answer.toString();
    }
}