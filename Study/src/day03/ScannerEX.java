package day03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("x의 값 입력");
        String strX = sc.nextLine();
        //strX의 변수 값을 숫자값으로 변경하여 int x에 저장하세요..

        int x = Integer.parseInt(strX);

        System.out.println("y의 값 입력");
        String strY = sc.nextLine();

        int y = Integer.parseInt(strY);
        System.out.println("y : " + y);

        //문자열은 연산이 되지 않기 때문에 알맞은 타입으로 캐스팅 기능을 제공하는 각 Wraper 클래스를 활용 해서 값 변경해야한다

        while(true){ // while문을 무한으로 돌린다~
            System.out.println("입력기능을 종료하고 싶으면 \"quit\"를 입력하세요! ");
            System.out.println("입력 문자열: ");
            String data = sc.nextLine();

            if(data.equals("quit")){
                break;
            }

            System.out.println("출력 문자열: ");
            System.out.println(data);

        }

    }
}
