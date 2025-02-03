package day01.inheritance.inheritance_01ex;

public class TvMain {
    public static void main(String[] args) {
        TV tv_retmotecontoller1 = new TV(); // 동일한 클래스 타입의 참조 변수를 생성해서 초기화
        TV tv_retmotecontoller2 = new SmartTV(); // 부모타입을 자식클래스 타입으로 받아서 초기화.
        //TV 클래스 타입의 참조변수 tv_retmotecontoller2를 선언하고, SmartTV인스턴스를 생성하여, 해당 인스턴스의 주소값을 참조변수 tv_retmotecontoller2에 대입한다.
        SmartTV smartTV_remotecontroller = new SmartTV();

        TV tv = new TV();
        SmartTV smartTV = (SmartTV) tv;
    }
}
