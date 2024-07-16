package ch17.sec03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("홍길동", 10));
        list.add(new Student("이길동", 20));
        list.add(new Student("고길동", 30));

        double avg = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();

        System.out.println("평균 점수 : " + avg);

        Stream<Student> stream = list.stream();
        stream.forEach(p -> System.out.println(p));
    }
}
