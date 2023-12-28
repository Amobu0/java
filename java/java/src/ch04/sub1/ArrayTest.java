package ch04.sub1;

public class ArrayTest {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        char[] arr2= {'A', 'B', 'C'};
        String[] arr3= {"서울", "대구", "부산", "광주", "제주도"};



        System.out.println("arr1[0] : "+ arr1[0]);
        System.out.println("arr2[2] : "+ arr2[2]);
        System.out.println("arr3[2] : "+ arr3[2]);

        System.out.println("arr1 원소갯수 : " +arr1.length);
        System.out.println("arr2 원소갯수 : " +arr2.length);
        System.out.println("arr3 원소갯수 : " +arr3.length);

        for (int i = 0; i <arr1.length ; i++){
            System.out.print(arr1[i] +" ");
        }
            System.out.println();
        for(int n : arr1) {
            System.out.print(n +" ");
        }
            System.out.println();
        for (char a : arr2) {
            System.out.print(a + " ");
        }
            System.out.println();
        for (String b : arr3) {
            System.out.print(b + " ");
        }
            System.out.println();

        //1차원
        int [] scores = {80,60,78,62,92};
        int total = 0;

        for (int score : scores) {
            total += score;
        }
        System.out.println("socres 전체 합 : "+ total);

        //2차원


        //3차원
    }
}
