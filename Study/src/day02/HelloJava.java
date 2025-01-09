package day02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args)throws IOException {
        System.out.println("Hello Java");
        callName();
        System.out.println("당신의 이름을 입력해주세요");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //왜 버퍼드리더를 쓰는지를 알아야한다.
//        String name = br.readLine();
//        br.close();

        System.out.println("당신의 이름은 " + name);
        callName();
        callName();
        callName();
        callName();

        String eat = callStringName();
        eat += "맛있다. 냠냠";
        System.out.println(eat);
        callStringParam(eat);
    }

    public static void callName() {
        System.out.println("내 이름을 불러죠...아하하하");
    }

    public static String callStringName(){
        String name2 = "라면";
        return name2;
    }

    public static void callStringParam(String _eat){
        System.out.println(_eat + " callString Param 처리 완료");
    }
}
