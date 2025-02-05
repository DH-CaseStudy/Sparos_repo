package day03.interfaceEx.ex01;

public class Cat extends Tail implements Animal, Pet{
    @Override
    public void play() {
        System.out.println("논다.");
    }

    @Override
    public void cry() {
        System.out.println("운다.");
    }
}
