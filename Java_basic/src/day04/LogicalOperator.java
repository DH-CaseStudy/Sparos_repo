package day04;

public class LogicalOperator {
    public static void main(String[] args) {
        //논리연산자의 종류 (&&, ||, ^, !)

        int charCode = 'A'; //65

        // charCode 변수에 들어있는 값이 대문자인지 소문자인지를 판별하고 싶음.

        if((charCode >=  65) && (charCode <= 90)){
            System.out.println("알파벳 대문자 이군요");
        }

        int charCode2 = 'a';

        if(charCode2 >= 97 && charCode2 <= 122){
            System.out.println("알파벳 소문자 이군요");
        }

        int charCode3 = 48;

        if(charCode3 >= 9 && charCode3 <= 57){
            System.out.println("0~9사이의 숫자 이군요");
        }

        int value = 6;
        // value 변수의 값이 짝수인지 홀수인지 검증하시오

        if(value % 2 ==0){
            System.out.println("짝수");
        } else{
            System.out.println("홀수");
        }

        if((value % 2 == 0) || (value % 3 == 0)){
            System.out.println("2또는 3의 배수이군요.");
        } else{
            System.out.println("2또는 3의 배수가 아니군요.");
        }
    }
}
