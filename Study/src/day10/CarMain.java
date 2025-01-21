package day10;

import day10.dao.CarDAO;
import day10.dto.CarDTO;
import day10.dto.Tire;

public class CarMain {
    public static void main(String[] args) {
        CarDTO car1 = new CarDTO();
        Tire tire = new Tire();
        tire.setModel("금호타이어");
        CarDTO car2 = new CarDTO("EV3", tire);
        CarDAO carDao =  new CarDAO(car2);
        carDao.insert();
        carDao.delete();
        carDao.update();
        carDao.select();
    }
}
