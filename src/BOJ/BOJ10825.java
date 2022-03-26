package BOJ;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Student implements Comparable<Student> {
    String name;
    int kor;
    int eng;
    int math;

    Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student other) {
        if(this.kor != other.kor) {
            if(this.kor > other.kor) return -1;
            else return 1;
        }
        if(this.eng != other.eng) {
            if(this.eng < other.eng) return -1;
            else return 1;
        }
        if(this.math != other.math) {
            if(this.math > other.math) return -1;
            else return 1;
        }
        return this.name.compareTo(other.name);
    }
}

public class BOJ10825 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Student[] arr = new Student[n];

        for(int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            arr[i] = new Student(name, kor, eng, math);
        }
        Arrays.sort(arr);

        for(Student s : arr) {
            sb.append(s.name).append("\n");
        }
        System.out.println(sb);
    }
}