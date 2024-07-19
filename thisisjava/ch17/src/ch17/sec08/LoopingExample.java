package ch17.sec08;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        // 잘못 작성한 경우
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(System.out::println);

        // 중간 처리 메소드 peek()을 이용해서 반복 처리
        int total = Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(System.out::println)
                .sum(); //최종처리
        System.out.println("total = " + total + "\n");

        // 최종 처리 메소드 forEach()를 이용해서 반복처리
        Arrays.stream(intArr)
                .filter(a -> a%2 == 0)
                .forEach(System.out::println);  //최종 처리이므로 동작함.

    }
}
