package day03.interfaceEx;

public interface RemoteControl {

    //인터페이스는 왜 쓰는가?
    //두 객체의 결합도를 낮추어서 코드의 유연성, 확장성을 극대화 하기위해

    int MAX_VALUE = 30;
    int MINIMUM_VALUE = 0;

    public void turnOn();
    public void turnOff();

    public abstract void setVolume(int volume);

}
