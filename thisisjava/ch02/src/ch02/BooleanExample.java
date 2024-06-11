package ch02;

public class BooleanExample {
    public static void main(String[] args) {
        boolean stop = true;
        if (stop) {
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");
        }

        int x = 10;
        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        int a = 10;
        int b = 20;
        double result = a / b;
        System.out.println("result = " + result);

        double result3 = (double) a / b;
        System.out.println("result3 = " + result3);

    }
}
