package ch17.sec12.exam03;

import ch17.sec12.exam01.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("남동길", "남", 92),
                new Student("여길동", "여", 87),
                new Student("남길동", "남", 95),
                new Student("여동길", "여", 93)
        );

        Map<String, Double> map = totalList.stream()
                .collect(
                        Collectors.groupingBy(s -> s.getSex(),
                                Collectors.averagingDouble(s -> s.getScore()))
                );
        System.out.println(map);
    }
}
