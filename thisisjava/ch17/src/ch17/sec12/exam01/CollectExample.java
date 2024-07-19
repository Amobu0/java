package ch17.sec12.exam01;

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
        List<Student> maleList = totalList.stream()
                .filter(s -> s.getSex().equals("남"))
                .toList();

        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));

        System.out.println();

        //학생 이름을 키, 학생의 점수를 값으로 갖는 Map 생성
        Map<String, Integer> map = totalList.stream()
                .collect(Collectors.toMap(
                        s -> s.getName(),   //Student 객체에서 키가 될 부분 리턴
                        s -> s.getScore()   //Student 객체에서 값이 될 부분 리턴
                ));
        System.out.println(map);
    }
}
