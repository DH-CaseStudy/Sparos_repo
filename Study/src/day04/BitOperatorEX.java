package day04;

public class BitOperatorEX {
    public static void main(String[] args) {
        int n1 = 10; // 0000 1010
        int n2 = 11; // 0000 1011

        System.out.println("n1 : " + Integer.toBinaryString(n1));
        System.out.println("n2 : " + Integer.toBinaryString(n2));

        System.out.println("n1 & n2 : " + Integer.toBinaryString(n1 & n2));
        System.out.println("n1 | n2 : " + Integer.toBinaryString(n1 | n2));
        System.out.println("n1 ^ n2 : " + Integer.toBinaryString(n1 ^ n2));
        System.out.println("~n1 : " + Integer.toBinaryString(~n1));
    }
}
