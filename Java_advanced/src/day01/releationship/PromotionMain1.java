package day01.releationship;

public class PromotionMain1 {
    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E();

    A a1 = b;
    A a2 = c;
    A a3 = d;
    A a4 = e;

    B b1 = d;
    C c1 = e;

//    B b2 = e; e는 b의 자식이 아니므로 불가능.
//    C C2 = d; d는 c의 자식이 아니므로 불가능.
}
