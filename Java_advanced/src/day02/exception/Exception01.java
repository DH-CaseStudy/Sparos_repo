package day02.exception;

public class Exception01 {
    public static void main(String[] args) {
        System.out.println("시작");
        printLength("This is Java Programming");
        printLength(null);

        try {
            Class.forName("java.lang.String");
            System.out.println("java.lang.String 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");
    }

    public static void printLength(String data){
        int result = 0;

        try {
            result = data.length();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("팝업 메시지");
        }
    }
}
