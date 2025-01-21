package day05;

public class Exercise {
    public static void main(String[] args){
//        Excercise1();
//        Excercise2();
//        Excercise3();
//        Excercise4();
//        Excercise5();
//        Excercise6();
//        Excercise7();
//        Excercise8();

    }

    static void Excercise1(){
        int x = 2;
        int y = 5;
        char c = 'A'; // 65

        System.out.println(1 + x << 33); // 6
        System.out.println(y >= 5 || x < 0 && x > 2); // true
        System.out.println(y += 10 - x++); // 13
        System.out.println(x += 2); // 7
        System.out.println( !('A' <= c && c <='Z')); // false
        System.out.println('C'-c); // C의 아스키코드 값  - 65
        System.out.println('5' - '0'); //각각 5 와 0의 아스키코드값을 뺀 값
        System.out.println(c+1); //66에 해당하는 아스키코드 값
        System.out.println(++c); //66에 해당하는 아스키코드 값
        System.out.println(c++); //66에 해당하는..
        System.out.println(c); //67에 해당하는...
    }

    static void Excercise2(){
        int numOfApples = 123; //사과의 개수
        int sizeOfBucket = 10;
        int numOfBucket = (numOfApples/sizeOfBucket) + 1;

        System.out.println("필요한 바구니의 수 :" + numOfBucket);
    }

    static void Excercise3(){
        int num = 10;
        System.out.println((num > 0) ? "양수" : "음수");
        System.out.println((num < 0) ? "음수" : "양수");
        System.out.println((num == 0) ? "0" : "??");
    }

    static void Excercise4(){
        int num = 456;
        System.out.println((int)(num/100) * 100);
    }

    static void Excercise5(){
        int num = 333;
        System.out.println((int)(((int)(num/100)* 100) + (((int)(num/100) * 100) * 0.1) + 1));
    }

    static void Excercise6()
    {
        int num = 24;
        System.out.println(((int)(num/10) * 10 + 10) - num);
    }

    static void Excercise7(){ // ??
        int fahrenheit = 100;
        float celcius = 5/9 * (fahrenheit - 32);

        System.out.println(celcius);
    }

    static void Excercise8(){
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);

        char ch = 'A';
        ch += 2;

        float f = (float) 3 / 2;
        long l = (long)3000 * (long)3000 * (long)3000;

        float f2 = 0.1f;
        double d = 0.1;

        boolean result = d != f2;

        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("result="+result);
    }

    static void Excercise9(){
        char ch = 'z';
        int a = (int)ch;
        boolean b = (a > 90) ? true: false;
    }
}
