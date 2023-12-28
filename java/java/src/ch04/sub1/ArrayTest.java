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
        int [][] arr2d = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12}};


        for (int [] arr2dd : arr2d ) {
            for(int arr2ddd : arr2dd){
                if(arr2ddd == 1 || arr2ddd==5 || arr2ddd==12){
                    System.out.println("2차원 배열 : "+ arr2ddd);
                }
            }
        }



        //3차원
        int [][][] arr3d = {{{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12}},
                         {{13, 14, 15, 16},
                          {17, 18, 19, 20},
                          {21, 22, 23, 24}},
                         {{25, 26, 27, 28},
                          {29, 30, 31, 32},
                          {33, 34, 35, 36}}};


        for (int [][] arr3dd : arr3d ) {
            for(int [] arr3ddd : arr3dd){
                for(int arr3dddd: arr3ddd){
                    if(arr3dddd == 36 || arr3dddd==1 || arr3dddd==19){
                        System.out.println("3차원 배열 : "+ arr3dddd);
                   }
                }
            }
        }
    }
}
