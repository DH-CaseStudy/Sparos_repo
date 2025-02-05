package day03.interfaceEx;

public class TV implements RemoteControl{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("TV를 켜다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끄다");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VALUE){
            this.volume = RemoteControl.MAX_VALUE;
            System.out.println("해당 제품의 최대 볼륨 값 입니다.");
        } else if (volume < RemoteControl.MINIMUM_VALUE){
            this.volume = RemoteControl.MINIMUM_VALUE;
            System.out.println("해당 제품의 최소 볼륨 값 입니다.");
        } else {
            this.volume = volume;
        }

        System.out.println("현재 볼륨은 " + this.volume);
    }
}
