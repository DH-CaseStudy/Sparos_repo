package day9.lambda.ex01;

import java.util.Arrays;
import java.util.List;

public class TestMain1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10);

        numbers.stream().filter(num -> num % 2 == 0).forEach(System.out::println);

        Runnable task1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello Java");
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello World");
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();

        MyFunction add = (a,b) -> a +b;
    }
}

@FunctionalInterface
interface  MyFunction {
    int apply(int a, int b);
}
