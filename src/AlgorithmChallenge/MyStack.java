package AlgorithmChallenge;
import java.util.ArrayList;

//JAVA ArrayList 클래스를 활용해서 스택을 다루는 push, pop 기능 구현해보기
//pop 기능 호출 시, 스택에 데이터가 없을 경우, null 을 리턴하도록 함
//다양한 데이터 타입을 다룰 수 있도록, Java Genric 타입 문법을 활용해보기

public class MyStack <T> {
    private final ArrayList<T> stack = new ArrayList<>();

    public void push(T item){
        stack.add(item);
    }

    public T pop(){
        if(stack.isEmpty())
            return null;

       return stack.remove(stack.size()-1);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public static void main(String[] args){
        MyStack<Integer> exam = new MyStack<>();
        exam.push(1);
        exam.push(2);
        exam.push(3);

        System.out.println(exam.pop());


    }


}
