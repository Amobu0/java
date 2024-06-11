package ch02;

public class LongExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
        //컴파일러는 int로 간주하기 때문에 에러 발생
        //long var3 = 100000000000000;
        long var4 = 100000000000000L;

    }
}
