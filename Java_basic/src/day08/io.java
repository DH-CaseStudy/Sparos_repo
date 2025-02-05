package day08;

import java.io.*;
import java.util.StringTokenizer;

public class io {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력기
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 출력
//        String str = br.readLine();
          StringBuilder sb = new StringBuilder();
        int number = Integer.parseInt(br.readLine());

        for(int i = 0; i < number; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(first + " "));
            bw.write(String.valueOf(second) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
