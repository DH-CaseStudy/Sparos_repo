package day05;
import java.util.*;
public class SwitchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("점수를 입력하세요. ");
            int a = sc.nextInt();

            if(a < 0 || a > 100){
                break;
            }

            if(a >= 80){
                System.out.println("축하합니다. 합격입니다.");
            } else {
                System.out.println("죄송합니다. 불합격입니다.");
            }
        }



    }
}
