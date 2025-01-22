package day11_exam;

import java.awt.*;

public class exam {
    public static void main(String[] args) {
        //1번 문제 : 

        //2번 문제 :

        //3번 문제 :

        //4번 문제 :

        //5번 문제 :

        //6번 문제 :

        //7번 문제 :

        //8번 문제 :

        Member user1 = new Member("홍길동", "hong");

        MemberService memberService = new MemberService();
        boolean result = memberService.login("hong", "12345");
        if(result){
            System.out.println("로그인 되었습니다");
            memberService.logout();
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }

        Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");
    }
}
