package day02.resourceEx;

import java.io.*;

public class FileTryWithResourceEx implements AutoCloseable {
    public static void main(String[] args) {

        try (FileWriter file = new FileWriter("data2.txt")) {
            file.write("Java Programming");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (
                FileReader fr = new FileReader("data.txt");
                BufferedReader br = new BufferedReader(fr);
        ) {

            while (true) {
                String data = br.readLine();
                if (data != null) {
                    System.out.println(data);
                } else break;

            }
        } catch (EOFException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void close() throws Exception {

    }
}

//try-with-resources 문은 마치 C#의 using과도 같은것으로 보인다. 바로쓰고 버리는... 그래서 close를 호출 할 필요가 없어보임.
