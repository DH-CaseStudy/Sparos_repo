package day9.lambda.ex06;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        Member m1 = person.getMember1(Member::new);

        System.out.println(m1);
        //Member m2 = person.getMember2(Member::new);
        Member m2 = person.getMember2((x, y) -> {
            return new Member(x, y);
        });

        System.out.println(m2);
    }
}
