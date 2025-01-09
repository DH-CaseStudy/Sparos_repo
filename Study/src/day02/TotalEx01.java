package day02;

import java.util.Scanner;

public class TotalEx01 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int a = sc.nextInt();
        int b = sc.nextInt();

        FourArithmetic(a, b);

        int kor = sc.nextInt();
        int eng = sc.nextInt();
        Average(kor, eng);
    }

    public static void Average(int _kor, int _eng){

        double average = 0.0;
        int total = 0;

        total = _kor + _eng;
        average = (total/2.0);

        System.out.printf("총점:%d%n", (_kor + _eng));
        System.out.printf("평균:%2.f", average);
    }

    public static void FourArithmetic(int _a, int _b){

        System.out.println("a+b=" + (_a + _b));
        System.out.println("a-b=" + (_a - _b));
        System.out.println("a*b=" + (_a * _b));
        System.out.println("a/b=" + (_a / _b));
    }
}






