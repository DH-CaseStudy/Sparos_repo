package day01.abstractex;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();

        animalSound(dog); // animal -> dog
        animalSound(cat); // animal -> cat
    }

    public static void animalSound(Animal animal){
        if(animal instanceof Cat){
            animal.sound();
        }
    }
}
