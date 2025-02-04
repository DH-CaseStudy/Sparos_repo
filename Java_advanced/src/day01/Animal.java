package day01;

public class Animal {

    void Sound(){
        System.out.println("동물의 소리");
    }
}

class Dog extends Animal{
    void Sound(){
        System.out.println("멍멍");
    }
}

class Cat extends Animal{
    void Sound(){
        System.out.println("냐오옹");
    }
}
