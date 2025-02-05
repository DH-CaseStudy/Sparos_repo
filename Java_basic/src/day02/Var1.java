package day02;
import java.util.Scanner;

public class Var1 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        addsum();
    }

    public static void addsum(){
        int value = 10;

        sc = new Scanner(System.in);

        int score = sc.nextInt();
        int result = value + score;
        System.out.println("result = " + result);
    }
}
