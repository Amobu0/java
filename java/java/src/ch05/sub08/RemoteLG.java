package ch05.sub08;

public class RemoteLG implements RemoteControl{


    @Override
    public void powerOn() {
        System.out.println("LG - poweron...");
    }

    @Override
    public void powerOff() {
        System.out.println("LG - poweroff...");
    }

    @Override
    public void chUp() {
        System.out.println("LG - chup...");
    }

    @Override
    public void chDown() {
        System.out.println("LG - chdown...");
    }

    @Override
    public void soundUp() {
        System.out.println("LG - soundup...");
    }

    @Override
    public void soundDown() {
        System.out.println("LG - sounddown...");
    }
}
