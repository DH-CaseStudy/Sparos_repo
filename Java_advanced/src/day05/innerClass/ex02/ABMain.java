package day05.innerClass.ex02;
class A{

    A(){
        B b = new B();
    }

    void method1(){
        B b = new B();
    }

    static void method2(){
        B b = new B();
    }

    static  class B{

//        B field1 = new B(); //무한 루프

        static B field2 = new B();
    }
}

public class ABMain {
    public static void main(String[] args) {
        //정적 멤버 클래스 B는 A.B() 직접 호출이 가능하다
        A.B b = new A.B();
    }
}
