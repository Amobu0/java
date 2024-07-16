package ch17.sec01.exam01;

import java.util.HashSet;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("홍길동");
        set.add("고길동");
        set.add("이길동");

        Stream<String> stream = set.stream();
        stream.forEach(name -> System.out.println(name));
    }
}
