package day03.interfaceEx;

public class TV implements RemoteControl{

    @Override
    public void turnOn() {
        System.out.println("TV를 켜다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끄다");
    }
}
