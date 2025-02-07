package innerClass;

//인스턴스 멤버클래스 B를 A 내부에 생성
//B객체는 A클래스 내부 어디에서나 생성할 수는 없고, 인스턴스 필드 값, 생성자, 인스턴스 메소드에 생성할 수 있음
public class ClassA {


    class B{
        //인스턴스 필드
        int field1 = 10;
        static int field2 = 20;

        B(){
            System.out.println("B의 생성자.");
        }

        //인스턴스 메소드
        void method1(){
            System.out.println("B의 method1");
        }

        static void method2(){
            System.out.println("B의 스태틱 method1");
        }
    }

    void useB(){
        B b = new B();
        System.out.println(b.field1);
        b.method1();

        System.out.println("B의 정적 필드와 정적 메소드");
        System.out.println(B.field2);
        B.method2();

    }

    B b = new B();

    public ClassA() {
        B b = new B();
    }

    void method(){
        B b = new B();
    }

}
