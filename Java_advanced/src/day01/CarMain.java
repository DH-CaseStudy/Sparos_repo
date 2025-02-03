package day01;

public class CarMain {
    public static void main(String[] args) {
        Car mycar = new Car();

        for(int i = 0; i < 3; i ++){
            mycar.speedUp();
        }

        System.out.println(mycar.getSpeed());

        SportsCar mycar2 = new SportsCar();

        for(int i = 0; i < 5; i ++){
            mycar2.speedUp();
        }

        System.out.println(mycar2.getSpeed());
    }
}
