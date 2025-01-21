package day07;

import java.sql.SQLOutput;

public class StringEx1 {
    public static void main(String[] args) {
        String ssn = "9504221245678";
        char  gender = ssn.charAt(6);

        switch (gender){
            case '1':
            case '3':
                System.out.println("남성입니다");
                break;

            case '2':
            case '4':
                System.out.println("여성입니다");
                break;

        }

        String oldStr = "자바 프로그래밍";
        String newStr = "혼자 공부하는 자바 프로그래밍";
        String printStr1 = oldStr.replace("자바", "Java");
        String printStr2 = newStr.replace("혼자", "같이");

        System.out.println(printStr1);
        System.out.println(printStr2);

        String sub = "문자열 잘라내기";
        String sub2 = sub.substring(0, 2);
        String[] sub3 = sub.split(" ");
        System.out.println(sub2);
        System.out.println(sub3[0]);
        System.out.println(sub3[1]);

        int location = newStr.indexOf("프로그래밍");
        System.out.println(location);

        String printStr4 = newStr.substring(11);
        System.out.println(printStr4);

        boolean printStr5 = newStr.contains("자바");
        if(printStr5){
            System.out.println("포함");
        } else{
            System.out.println("불포함");
        }

        String board = "1,제목,내용,작성,파일";
        String[] tokens = board.split(",");

        for(String value : tokens){
            System.out.println(value);
        }


    }
}
