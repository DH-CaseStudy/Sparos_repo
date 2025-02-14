package day9.lambda.ex04;

public class Person {

    public void action(Calculable calculable){
        double result = calculable.calculate(20, 5);
        System.out.println("결과 " +result);
    }
}
