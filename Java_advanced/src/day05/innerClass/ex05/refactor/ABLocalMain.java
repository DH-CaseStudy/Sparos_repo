package day05.innerClass.ex05.refactor;

public class ABLocalMain {
    public static void main(String[] args) {
        A a = new A();
        a.useB(5);
    }

}

class A {
    //메소드
    void useB(int param) {
        int value = 1; // final int value
        //A클래스의 useB라는 메소드에 정의된 로컬클래스 B
        class B {
            int field1 = 10;
            static int field2 = 20;

            public B() {
                System.out.println("B 생성자 실행");
            }

            void method1() {
                System.out.println(param);
                System.out.println(value);

//                System.out.println("B - method1 실행");
//                System.out.println("원본 = " + field1);
//                field1 = 30;
//                System.out.println("수정 = " + field1);
            }

            static void method2() {
                System.out.println("B - static method2 실행");
            }
        }

        B b = new B();
        System.out.println(b.field1);
        b.method1();

        System.out.println(B.field2);
        B.method2();
    }
}
