package day01;

public class SmartPhoneMain {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "흰색");

        //Phone으로 부터 상속받은 필드
        System.out.println(myPhone.model);
        System.out.println(myPhone.color);

        //SmartPhone의 필드 출력
        System.out.println(myPhone.wifi);

        //Phone으로 부터 상속받은 메소드
        myPhone.bell();

        //SmartPhone으로 부터 상속받은 메소드
        myPhone.setWifi(true);
    }
}
