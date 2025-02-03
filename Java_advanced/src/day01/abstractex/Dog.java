package day01.abstractex;

public class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println("멍! 멍!"); //추상클래스의 부모를 갖은 자식클래스에서는 추상메서드를 반드시 구현해야한다.
    }
}
