package day01.inheritance.inheritance_02ex;

public class Driver {
    public void drive(Vehicle vehicle){
//        Object obj = vehicle;
//        Vehicle v = (Vehicle) obj;
        if(vehicle instanceof  Taxi || vehicle instanceof  Bus){
            vehicle.run();
        } else {
            System.out.println("해당되지않습니다.");
        }
    }
}
