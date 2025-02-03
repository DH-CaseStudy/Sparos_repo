package day01;

public class Car {
    private int speed;

    public final void stop(){
        System.out.println("차를 멈춤");
        this.speed = 0;
    }

    public void speedUp(){
        this.speed++;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
