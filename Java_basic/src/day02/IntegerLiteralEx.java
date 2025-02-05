package day02;

public class IntegerLiteralEx {
    public static void main(String[] args){
        // 10진수 11을 이진수로 저장하려고 한다. 어떻게 표현하면 될까?
        int x = 0b1011; // 11을 이진수로

        // 10진수 11을 8진수로 저장하려고 한다 어떻게 표현하면 될까?
        int y = 013;

        // 16진수 0x, 0x 로 시작하고 0~9 숫자 그대로 10~15까지 대문자 A~F 매칭해서 사용
        int z = 0xB;
        
        int var1 = 0b111;
        int var2 = 0206;
        int var3 = 365;
        int var4 = 0xB3;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);

    }
}
