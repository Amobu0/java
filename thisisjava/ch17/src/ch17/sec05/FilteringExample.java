package ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("고길동");
        list.add("김길동");
        list.add("홍길동");
        list.add("홍길동");
        list.add("홍송길동");

        list.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        list.stream()
                .filter(s -> s.startsWith("홍"))
                .forEach(System.out::println);
        System.out.println();

        list.stream()
                .distinct()
                .filter(s -> s.startsWith("홍"))
                .forEach(System.out::println);
    }
}
