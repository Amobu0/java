package ch05.sub08;

public class RemontSamsung implements RemoteControl{
    @Override
    public void powerOn() {
        System.out.println("Samsung - poweron...");
    }

    @Override
    public void powerOff() {
        System.out.println("Samsung - poweroff...");
    }

    @Override
    public void chUp() {
        System.out.println("Samsung - chup...");
    }

    @Override
    public void chDown() {
        System.out.println("Samsung - chdown...");
    }

    @Override
    public void soundUp() {
        System.out.println("Samsung - soundup...");
    }

    @Override
    public void soundDown() {
        System.out.println("Samsung - sounddown...");
    }
}
