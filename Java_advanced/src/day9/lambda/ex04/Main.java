package day9.lambda.ex04;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(Computer::staticMethod); //누구나 사용 가능
        person.action((a, b) -> Computer.staticMethod(a,b));
        Computer computer = new Computer();
        person.action(computer::instanceMethod); // 프라이빗한
        person.action((a,b) -> {
            return computer.instanceMethod(a,b);
        });
    }
}
