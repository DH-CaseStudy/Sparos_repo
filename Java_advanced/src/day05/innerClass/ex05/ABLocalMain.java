package day05.innerClass.ex05;

public class ABLocalMain {
    public static void main(String[] args) {
        A a = new A();
        a.method();
    }

}

class A{
    public A() {
        class B{ }

        B b = new B();
    }

    void method(){
        class B{}

        B b = new B();
    }
}
