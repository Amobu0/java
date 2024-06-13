package ch05;

public class ArrayInit {
    public static void main(String[] args) {

        int[] scores = {100, 87, 91};

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += scores[i];
        }
        int avg = sum/3;
        System.out.println(avg);
    }
}
