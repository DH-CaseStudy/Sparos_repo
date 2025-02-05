package day07;

import java.util.Scanner;

class Car{
    int speed;
    String color;

    String getColor(){
        return this.color;
    }
}

public class TestClass {
    public static void main(String[] args) {
        int num = 1; //기본

        //Scanner sc = new Scanner((System.in));
        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println((car1.toString()));
        System.out.println((car1.getClass().getName()));

        System.out.println((car2.toString()));
        System.out.println((car2.getClass().getName()));

        String color = car1.getColor();

        car1.color = "red";
        car2.color = "blue";

        System.out.println(car1.color);
        System.out.println(car2.color);


    }
}
