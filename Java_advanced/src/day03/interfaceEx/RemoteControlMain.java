package day03.interfaceEx;

public class RemoteControlMain {
    public static void main(String[] args) {
        RemoteControl remoteControl;

        remoteControl = new TV();
        remoteControl.turnOn();
        remoteControl.setVolume(10);
        remoteControl.turnOff();

        remoteControl = new Radio();
        remoteControl.turnOn();
        remoteControl.setVolume(20);
        remoteControl.turnOff();

    }
}
