package day02.exception;

public class ThrowsEx {
    public static void main(String[] args) {
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("해당 클래스는 찾을 수 없습니다. " + e.getMessage());
        }

    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
