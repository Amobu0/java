package ch04;

public class IfElseifElseExample {
    public static void main(String[] args) {

        int grade = 37;

        if (grade >= 50) {
            System.out.println("A등급");
        } else if (grade >= 40) {
            System.out.println("B등급 입니다.");
        } else if (grade >= 30) {
            System.out.println("C등급");
        } else if (grade >= 20) {
            System.out.println("D등급");
        } else {
            System.out.println("F등급");
        }
    }
}
