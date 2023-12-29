package ch04.sub2;

public class MethodTest {

    // main method : 자바 프로그램 시작 메서드
    public static void main(String[] args) {

        // method 호출
        int y1 = f(1);
        int y2 = f(2);
        int y3 = f(3);

        System.out.println("y1 : "+y1);
        System.out.println("y2 : "+y2);
        System.out.println("y3 : "+y3);
        //method 지역변수 call stack

        int z1 = sum(1, 10);
        int z2 = sum(1, 100);

        System.out.println("z1 : "+z1);
        System.out.println("z2 : "+z2);

    }// main 끝

    // 전역변수
    int num = 1;

    //method 정의
    public static int f(int x) {
        // 지역변수 y
        int y = 2 * x + 3;
        return y;
    }

    // 지역변수 start, end, total
    public static int sum (int start, int end) {
        int total = 0;
        for(int k=start ; k <= end ; k++) {
            total += k;
        }
        return total;
    }
}
