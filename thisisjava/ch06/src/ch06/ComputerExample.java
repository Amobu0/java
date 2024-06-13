package ch06;

public class ComputerExample {
    public static void main(String[] args) {
        Computer myCom = new Computer();
        int result1 = myCom.sum(1, 2, 3);
        System.out.println(result1);

        int result2 = myCom.sum(1, 2, 3, 4);
        System.out.println(result2);
    }

    public static class Computer {
        //개별길이 매개변수를 갖는 메소드 선언
        int sum(int... values) {
            //sum 변수 선언
            int sum = 0;
            for (int i = 0; i < values.length; i++) {
                sum += values[i];
            }
            return sum;
        }
    }
}
