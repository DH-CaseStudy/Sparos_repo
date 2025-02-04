package day01;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Dog());
        animals.add(new Cat());

        for(Animal animal :  animals){
            animal.Sound();
        }

    }
}
