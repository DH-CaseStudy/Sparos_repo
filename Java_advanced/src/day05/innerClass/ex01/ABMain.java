package day05.innerClass.ex01;

public class ABMain {
    public static void main(String[] args) {
        ClassA a = new ClassA(); //A객체 생성

        ClassA.B b = a.new B(); //A의 내부에 있는 B객체를 생성.

        a.useB();

    }
}
