package ch05.sub08;
/*
 날짜 : 2024/01/04
 이름 : 송상도
 내용 : Java 인터페이스 실습하기
*/

class Computer {
    public void boot() {
        System.out.println("시스템 부팅...");
    }
}
interface Internet {
    public void access();

}
class Tv extends Computer implements Internet {

    @Override
    public void access() {
        System.out.println("인터넷 접속...");
    }
    public void show() {
        System.out.println("Tv 시청...");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        // 인터페이스 예제 1 = 표준화된 클래스 설계
        RemoteControl lg = new RemoteLG();
            lg.chUp();
            lg.powerOn();
            lg.soundUp();
            lg.chDown();
            lg.soundDown();
            lg.powerOff();
            System.out.println();

        RemoteControl ss = new RemontSamsung();
            ss.powerOn();
            ss.chUp();
            ss.soundDown();
            ss.chDown();
            ss.soundUp();
            ss.powerOff();
            System.out.println();


        // 인터페이스 예제 2 = 유연성(결합도 완화)
        Bulb bulb = new Bulb();
        Socket socket = new Cable(bulb);

        socket.switchOn();
        socket.switchOff();
        System.out.println();
        // 인터페이스 예제 3 = 다중 상속 효과
        Tv smartTv = new Tv();
        smartTv.boot();
        smartTv.access();
        smartTv.show();
    }
}
