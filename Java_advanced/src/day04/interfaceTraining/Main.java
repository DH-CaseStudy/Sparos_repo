package day04.interfaceTraining;

public class Main {
    public static void main(String[] args) {
        ABCImpl abcImpl = new ABCImpl();
        InterfaceA ia = abcImpl;
        ia.methodA();
        System.out.println();

        InterfaceB ib = abcImpl;
        ib.methodB();
        System.out.println();

        InterfaceC ic = abcImpl;
        ic.methodA();
        ic.methodB();
        ic.methodC();

    }

    //자식 인터페이스를 구현 한 클래스는 자식 인터페이스의 메소드 뿐만 아니라, 부모의 인터페이스도
    // 모든 추상메소드를 재정의 해야 하며, 구현 객체는 자식 및 부모인터페이스에 대입될 수 있다.
}
