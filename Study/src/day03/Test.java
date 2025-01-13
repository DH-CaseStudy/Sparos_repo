package day03;

public class Test {
    public static void main(String[] args) {
        String str = "수식을 출력하면 계산 결과가 출력됩니다.";
        int a = 10;
        int b = 5;
        int sum = a + b;
        String str1 = "내 생일은 2005년 6월 17일 입니다.";

        //System.out.printf("%s%n%d + %d = %d%n%s", str, a, b, sum, str1);

        //Java 부터 텍스트 블록 문법을 제공한다.
        String str2 = """
                 subject score
                =============
                  korean    90
                 english   100
                computer    80
                김진수 학생의 점수는\
                최상위 점수의 학생입니다
                """;

        //ystem.out.println(str2);

        byte z = 10;
        short f = z; // 더 큰 형으로 변화하니까 자동 프로모션이 가능하다.
        int cc = z;
        long dd = cc;
        float ff = dd;
        double uu = ff;

        //System.out.printf("%f", uu);


        char charValue = 'A';
        int intValue = charValue;
        System.out.println(charValue);
        System.out.println(intValue);

        byte byteValue = 65;
        int charval = byteValue;

        System.out.println(charval);


    }
}
