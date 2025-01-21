import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[st.countTokens()];

        int max = 0;
        int min = 0;

        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(st.nextToken());

            if(array[i] == 999){
                break;
            }

            if(max < array[i]){
                max = array[i];
            }

            if(Math.abs(min) > array[i]){
                min = array[i];
            }

        }

        System.out.printf("max : %d\n", max);
        System.out.printf("min : %d", min);

    }
}

