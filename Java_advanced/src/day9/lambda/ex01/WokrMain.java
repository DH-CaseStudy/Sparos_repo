package day9.lambda.ex01;

public class WokrMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.action(() -> {
            System.out.println("work");
            System.out.println("오전 업무");
            System.out.println("오후 업무");
            System.out.println("퇴근");
        });

        person.action(() -> {
            System.out.println("주말에 축구 동호회");
        });
    }
}
