package day02;

public class FourArithmetic {
    public static void main(String[] args) {
        int a = 12;
        int b = 2;

        System.out.println("a+b=" + (a + b));
        System.out.println("a-b=" + (a - b));
        System.out.println("a*b=" + (a * b));
        System.out.println("a/b=" + (a / b));

        Teaching();
    }

    public static void Teaching(){
        int a = 12;
        int b = 2;
        int result = 0;

        result = a + b;
        System.out.printf("a + b = %d%n", result); // %d는 reulst를 인자로 사용하고 %n은 줄바꿈

        result = a - b;
        System.out.printf("a - b = %d%n", result); // %d는 reulst를 인자로 사용하고 %n은 줄바꿈

        result = a * b;
        System.out.printf("a * b = %d%n", result); // %d는 reulst를 인자로 사용하고 %n은 줄바꿈

        result = a / b;
        System.out.printf("a / b = %d%n", result); // %d는 reulst를 인자로 사용하고 %n은 줄바꿈
    }

}
