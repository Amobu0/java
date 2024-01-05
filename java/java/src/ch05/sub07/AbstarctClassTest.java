package ch05.sub07;
/*
 날짜 : 2024/01/04
 이름 : 송상도
 내용 : Java 추상클래스 실습하기
*/

public class AbstarctClassTest {
    public static void main(String[] args) {

        Car sonata = new Sedan("소나타", "흰색", 0,2000);
        Car bongo = new Truck("봉고", "파랑", 0 ,102);

        sonata.speedUP(80);
        sonata.speedDown(20);
        sonata.show();

        bongo.speedUP(70);
        bongo.speedDown(20);
        bongo.show();


        if (sonata instanceof Car) {
            System.out.println("1");
        };
        if (bongo instanceof Truck) {
            System.out.println("2");
        }

    }
}
