package car;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Sportage", "이동휘", 10);

        for(int i = 0; i < 10; i++){
            car.speedDown();
            if(car.getSpeed() == 0){
                System.out.println("stop");
            }
        }


    }
}
