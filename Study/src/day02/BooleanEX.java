package day02;

public class BooleanEX {
    public static void main(String[] args) {
        boolean stop = true;
        boolean start = false;

        if(stop){
            System.out.println("멈추어라.");
        } else{
            System.out.println("계속 진행하세요");
        }

        int bool = 10;

        boolean result = (bool == 20); //bool의 값이 20이니?
        System.out.println(result);

        result = (bool != 20); //bool의 값이 20이 아닌게 맞니?
        System.out.println(result);
    }
}
