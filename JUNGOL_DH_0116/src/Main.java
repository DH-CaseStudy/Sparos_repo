import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] array = new Integer[st.countTokens()];

        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array, Collections.reverseOrder());

        System.out.println(Arrays.toString(array));


    }
}

