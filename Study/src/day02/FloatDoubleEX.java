package day02;

public class FloatDoubleEX {
    public static void main(String[] args) {
        double x = 0.25;
        double y = -3.14; //10진수 리터럴

        double z = 5e2; // 5.0 * 10 * 10 = 500.0
        double k = 0.12e-2; // 0.12 * 10의 -2 제곱 0.0012;
        // 자바 컴파일러는 실수 리터럴을 기본적으로 double타입으로 해석하기 때문에 double 타입변수에 대입하는것이 디폴트다.

        float o = 3.14f; //
        float v = 3e6f; // 3 * 10의 6제곱
    }
}
