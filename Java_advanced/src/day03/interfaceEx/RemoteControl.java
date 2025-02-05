package day03.interfaceEx;

public interface RemoteControl {

    //인터페이스는 왜 쓰는가?
    //두 객체의 결합도를 낮추어서 코드의 유연성, 확장성을 극대화 하기위해

    int MAX_VALUE = 30;
    int MINIMUM_VALUE = 0;

    public void turnOn();
    public void turnOff();

    public abstract void setVolume(int volume);

    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음 모드로 전환됩니다.");
            setVolume(MINIMUM_VALUE);
        } else {
            System.out.println("무음 해제");
        }
    }

}
