package ch02;//import 출처
import java.util.Scanner;

public class sub2 {
    public static void main(String[] args) {
        System.out.print("숫자 입력 : ");

        //사용자 입력
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println("입력한 숫자: " + num);

        switch (num % 2) {
            case 0:
                System.out.println("num은 짝수입니다.");
                break;
            case 1:
                System.out.println("num은 홀수입니다.");
                break;
        }

    }
}
