package day02;

import java.util.Scanner;

public class Operator {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int total = 0;
        int average = 0;

        total = (kor + eng);
        average = (total/2);

        System.out.printf("총점은 : %d%n", total);
        System.out.printf("평균은 : %d", average);
    }
}
