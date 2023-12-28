package ch03;

public class sub3 {
    public static void main(String[] args) {


        //for
//        for(int i = 1 ; i <= 5; i++) {
//            System.out.println("i : " + i);
//        }
//
//
//        //1부터 10까지 합
//        int sum = 0;
//        for(int j= 1; j<=10; j++) {
//            sum += j;
//        }
//        System.out.println("1부터 10까지 합 : " + sum);
//
//
//        //1부터 10까지 짝수합
//        int sum1 = 0;
//        for(int k = 1 ; k<=10; k++){
//            if (k % 2 == 0) {
//                sum1 += k;
//            }
//        }
//        System.out.println("1부터 10까지 짝수합 : " + sum1);
//
//
//        //for 중첩
//        for(int a = 1 ; a<=3 ; a++){
//            System.out.println("a : "+ a);
//            for(int b = 1 ; b<=5; b++){
//            System.out.println("b : "+ b);
//            }
//        }


        //구구단
        for (int a = 2; a <= 9; a++){
                System.out.println( a+"단");
            for (int b = 2; b <= 9; b++){
                int c = a * b;
                System.out.printf("%d * %d = %d\n", a, b, c);
            }
        }


        //별삼각형
for (int start = 10 ; start >= 1 ; start--) {

    for (int end = 1 ; end <= start; end++) {
        System.out.print("★");
    }
    System.out.println();
}
    }
}
