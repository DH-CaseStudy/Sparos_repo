package day03.interfaceEx;

public class Radio implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("라디오를 켜다");
    }

    @Override
    public void turnOff() {
        System.out.println("라디오를 끄다");
    }
}
