package day01;

public class AirplaneMain {
    public static void main(String[] args) {
        AirPlane airPlane = new AirPlane();

        airPlane.takeoff();
        airPlane.fly();
        airPlane.lnad();

        SuperAirPlane superAirPlane = new SuperAirPlane();

        superAirPlane.takeoff();
        superAirPlane.flyMode = SuperAirPlane.ADVANCED; //상수를 할당할 때 클래스로
        superAirPlane.fly();
        superAirPlane.lnad();
    }
}
