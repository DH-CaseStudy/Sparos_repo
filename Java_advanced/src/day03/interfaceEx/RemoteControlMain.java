package day03.interfaceEx;

public class RemoteControlMain {
    public static void main(String[] args) {
        RemoteControl remoteControl;
        remoteControl = new TV(); //인터페이스는 자신을 구현한 구현객체(TV)를 담을 수 있다.
        remoteControl.turnOn();
        remoteControl.turnOff();

        remoteControl = new Radio();

        remoteControl.turnOn();
        remoteControl.turnOff();
    }
}
