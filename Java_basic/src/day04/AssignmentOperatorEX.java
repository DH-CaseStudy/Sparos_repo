package day04;

import java.sql.SQLOutput;

public class AssignmentOperatorEX {
    public static void main(String[] args) {
        int result = 10;

        result += 10; // result = result + 10;
        result -= 10; // result = result - 10;
        result *= 10; // result = result * 10;
        result /= 10; // result = result / 10;
        result %= 10; // result = result % 10;

        //삼항(조건) 연산자 : (변수 비교연산자 변수) ? (true)값1 : (false)값2

        int score = 70;

        char grade = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');
        System.out.println(score + "점은" + grade + "입니다.");
    }
}
