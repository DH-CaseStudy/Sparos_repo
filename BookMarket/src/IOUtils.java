import java.io.*;

public class IOUtils {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 문자열 입력 받기
    public static String readLine() {
        try {
            return br.readLine();
        } catch (IOException e) {
            System.err.println("입력 오류 발생: " + e.getMessage());
            return null;
        }
    }

    // 숫자 입력 받기
    public static int readInt() {
        try {
            return Integer.parseInt(br.readLine().trim());
        } catch (IOException | NumberFormatException e) {
            System.err.println("숫자 입력 오류: " + e.getMessage());
            return -1;
        }
    }

    // 문자열 출력하기
    public static void write(String message) {
        try {
            bw.write(message);
            bw.flush();
        } catch (IOException e) {
            System.err.println("출력 오류 발생: " + e.getMessage());
        }
    }

    // 줄바꿈 포함 출력
    public static void writeLine(String message) {
        try {
            bw.write(message + "\n");
            bw.flush();
        } catch (IOException e) {
            System.err.println("출력 오류 발생: " + e.getMessage());
        }
    }

    // 스트림 닫기
    public static void close() {
        try {
            br.close();
            bw.close();
        } catch (IOException e) {
            System.err.println("스트림 닫기 오류: " + e.getMessage());
        }
    }
}
