package day06;

import java.util.Scanner;

//CLI Application : 키보드에서 1, 2, 3 입력했을 때 속도가 증가 or 감소 , 종료
public class KeyControlEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true; // 현실세계에서 자동차가 달리다. ==> 컴퓨터 세계 boolean run = true (엔진을 켜다)
        int speed = 0;
        while (run) { //메뉴 생성
            System.out.println("---------------------------------");
            System.out.println("1. 속도 증가  |   2. 감속  |   3. 중지");
            System.out.println("---------------------------------");
            System.out.print("선택하세요");

            String strNum = sc.nextLine(); // 키보드에서 입력한 내용을 읽어서 변수 strNum에 저장하겠다.

            if (strNum.equals("1")) { //값비교!! == 는 주소비교이니 주의하시오.
                speed++;
                System.out.println("현재속도 : "+ speed);
            } else if(strNum.equals("2")){
                speed--;
                System.out.println("현재속도 : " + speed);
            } else if(strNum.equals(("3"))){
                run = false;
                System.out.println("");
            }
        }


        System.out.println("프로그램 종료");
    }
}
