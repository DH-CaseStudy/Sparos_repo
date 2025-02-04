package day02.resourceEx;

import java.io.FileWriter;
import java.io.IOException;

public class FileEX {
    public static void main(String[] args) throws IOException {
        FileWriter file = null;

        try {
            file = new FileWriter("data.txt");
            file.write("Java Advanced Programming");
        } catch (IOException e) {
            throw new RuntimeException(e); //option + command + t
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
