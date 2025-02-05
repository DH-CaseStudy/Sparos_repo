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

        //상수는 구현 객체와 관련이 없는 인터페이스의 멤버이므로 바로 접근하여 값을 읽는다.
        System.out.println(remoteControl.MAX_VALUE);
        System.out.println(remoteControl.MINIMUM_VALUE);
    }
}
