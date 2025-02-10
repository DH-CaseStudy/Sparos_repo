package day6.api;

public class Member1Main {
    public static void main(String[] args) {
        Member1 m1 = new Member1("이동휘", 33);
        System.out.println(m1.name());
        System.out.println(m1.age());
        System.out.println(m1.toString());
    }
}
