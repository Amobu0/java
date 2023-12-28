package ch03;

//날짜:2023/12/28
//이름:송상도
//내용:While 실습하기
public class sub4 {
    public static void main(String[] args) {


        // 1부터 10까지 합
        int sum = 0;
        int a = 0;
        while (a<=10) {
            sum += a;
            a++;
        }
        System.out.println("1부터 10까지 합 : "+sum);


        // 1부터 10까지 홀수 합
        int sum1 = 0;
        int b = 0;
        while(b <= 10){
            if (b % 2 != 0) {
                sum1 += b;
            }
                b++;
        }
        System.out.println("1부터 10까지 홀수 합 : "+sum1);


        // do-while
        int sum2 = 0;
        int c = 0;

        do {
            if(c %2 ==0) {
                sum2 +=c;
            }
            c++;
        }while(c <= 10);
            System.out.println("1부터 10까지 짝수 합 : "+sum2);


        //break
        int num = 1;

        while(true) {
            if(num % 5 == 0 && num % 7 ==0) {
                break;
            }
            num++;
        }
        System.out.println("5와 7의 최소공배수 : " +num);

        //contuine
        int total = 0;
        int n = 0;

        while (n <= 10) {
            n++;
            if(n %2 != 0) {
                continue;
            }
            total += n;
        }
        System.out.println("1부터 10까지 짝수 합 : "+ total);
    }
}
