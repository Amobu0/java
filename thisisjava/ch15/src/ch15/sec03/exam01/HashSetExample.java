package ch15.sec03.exam01;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("java");
        set.add("jdbc");
        set.add("jsp");
        set.add("java");
        set.add("spring");
        set.add("springBoot");

        int size = set.size();
        System.out.println("총 객체 수: "+ size);
    }
}
