package day9.lambda.ex03;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(1,5);

        person.action((x,y) -> (double)(x + y));
        person.action((x,y) -> sum(x,y));
    }

    public static double sum(double x, double y){
        return (x+y);
    }
}
