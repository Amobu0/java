package ch05.sub04;
/*
 날짜 : 2024/01/03
 이름 : 송상도
 내용 : Java 상속 실습하기
*/
public class InheritanceTest {
    public static void main(String[] args) {
        //Car 상속객체 생성
        Sedan sonata = new Sedan(" 소노타", "흰색", 0, 2000);
        sonata.speedUp(80);
        sonata.speedTurbo();
        sonata.show();
        System.out.println();

        Truck bongo = new Truck("봉고", "파랑", 0, 0);
        bongo.load(100);
        bongo.speedUp(80);
        bongo.show();
        System.out.println();
        // Account 상속객체 생성
        StockAccount kb = new StockAccount(
                "KB증권",
                "12-123-1234",
                "홍길동",
                1000000,
                "삼성전자",
                0,
                50000);
        kb.deposit(1000000);
        kb.buy(10, 50000);
        kb.sell(5,50000);
        kb.show();
    }
}
