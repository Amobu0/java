package ch05.sub01;

/*
 날짜 : 2024/01/02
 이름 : 송상도
 내용 : JAVA 클래스 실습하기
 */
public class ClassTest {
    public static void main(String[] args) {

        // Car 객체 생성
        Car sonata = Car.getInstance();
        Car avante = Car.getInstance();

        sonata.name = "소나타";
        sonata.color = "흰색";
        sonata.speed = 0;

        // Car 객체 상호작용
        sonata.speedUp(60);
        sonata.speedDown(20);
        sonata.show();

        System.out.println();

        // Car 객체 선언, 생성, 초기화, 상호작용
        avante.name = "아반테";
        avante.color = "검은색";
        avante.speed = 0;

        avante.speedUp(80);
        avante.speedDown(20);
        avante.show();

        System.out.println();


        //Account 객체 생성/초기화/상호작용
        Account kb = Account.getInstance();
        Account busan = Account.getInstance();

        kb.bank = "국민은행";
        kb.id = "국민-01";
        kb.name = "국민-홍길동";
        kb.balance= 10000;

        kb.deposit(40000);
        kb.withdraw(30000);
        kb.show();
        System.out.println();


        busan.bank = "부산은행";
        busan.id = "부산-01";
        busan.name = "부산-홍길동";
        busan.balance = 90000;


        busan.deposit(40000);
        busan.withdraw(30000);
        busan.show();

    }
}
