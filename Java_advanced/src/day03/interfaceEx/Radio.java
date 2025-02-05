package day03.interfaceEx;

public class Radio implements RemoteControl{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("라디오를 켜다");
    }

    @Override
    public void turnOff() {
        System.out.println("라디오를 끄다");
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

    private int memoryVolume;
    //내가 사용했던 이전 볼륨을 기억했다가 무음모드로 해제 이후 다시 복원
    @Override
    public void setMute(boolean mute) {
        if(mute){
            this.memoryVolume = this.volume;
            System.out.println("무음 처리");
            setVolume(RemoteControl.MINIMUM_VALUE);
        } else {
            System.out.println("무음 해제");
            setVolume(this.memoryVolume); //원복
        }
    }
}
