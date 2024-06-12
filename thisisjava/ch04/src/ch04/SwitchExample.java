package ch04;

public class SwitchExample {
    public static void main(String[] args) {

        int num = (int) ((Math.random() * 6) + 1);

        switch (num) {
            case 1:
                System.out.println("숫자: 1");
                break;
            case 2:
                System.out.println("숫자: 2");
//                break;
            case 3:
                System.out.println("숫자: 3");
//                break;
            case 4:
                System.out.println("숫자: 4");
                break;
            case 5:
                System.out.println("숫자: 5");
                break;
            default:
                System.out.println("숫자: 6");
                break;
        }

    }


}
