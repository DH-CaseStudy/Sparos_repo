package day01;

public class SportsCar extends Car {

    @Override
    public void speedUp() {
        int speed = getSpeed();
        speed += 10;
        setSpeed(speed);
    }
}
