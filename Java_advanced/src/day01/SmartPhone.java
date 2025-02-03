package day01;

public class SmartPhone extends Phone{

    public boolean wifi;

    public SmartPhone(String model, String color) {
        super(model, color); //반드시 작성
//      this.model = model;
//      this.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        if(this.wifi) internet();
    }

    public void internet(){
        System.out.println("인터넷을 연결합니다.");
    }

    @Override
    public void bell() {
//        System.out.println("기존 벨소리");
//        super.bell();
        System.out.println("추가된 벨소리");
        System.out.println("띠리링 띠리링");
    }
}
