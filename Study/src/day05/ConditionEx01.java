package day05;
import java.util.Scanner;

public class ConditionEx01 {
    public static void main(String[] args) {

        gradeTest();

    }

    private static void gradeTest() {

        Scanner sc = new Scanner(System.in);

        String str1 = "1.삽입";
        String str2 = "2.수정";
        String str3 = "3.삭제";

        System.out.printf("%s\n%s\n%s\n숫자를 선택하세요. ");

        int num1 = sc.nextInt();

        if(num1 == 1){
            System.out.printf("삽입을 선택하셨습니다.");
        } else if(num1 == 2){
            System.out.printf("수정을 선택하셨습니다.");
        } else {
            System.out.printf("삭제를 선택하셨습니다.");
        }

    }
}
