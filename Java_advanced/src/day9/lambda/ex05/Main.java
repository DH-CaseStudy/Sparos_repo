package day9.lambda.ex05;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.ordering((a,b) -> {
            return a.compareToIgnoreCase(b);
        });
    }
}
