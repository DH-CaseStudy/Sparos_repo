package day06;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 \"exit\"를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        String inputStr = null;

        do{
            System.out.print(">");
            inputStr = sc.nextLine();
            System.out.println(inputStr);

        }while(!inputStr.equals("exit"));

        System.out.println();
        System.out.println("프로그램 종료");
    }
}
