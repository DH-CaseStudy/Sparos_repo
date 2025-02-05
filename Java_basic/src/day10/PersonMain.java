package day10;

public class PersonMain {
    public static void main(String[] args) {
        Person LDH = new Person("이동휘", 33, "010", "male");

        System.out.println(LDH.getName() + " " + LDH.work());
        System.out.println(LDH.getName() + " 점심 시간에 " + LDH.eat());
        System.out.println(LDH.getName() + " 점심 시간에 " + LDH.walk());
    }
}
