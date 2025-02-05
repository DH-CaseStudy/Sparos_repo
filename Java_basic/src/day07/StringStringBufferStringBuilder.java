package day07;

import java.util.Scanner;

public class StringStringBufferStringBuilder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            for(int j = 0; j < (num - i - 1) * 2; j++){
                sb.append(" ");
            }

            for(int k = 0; k <=i; k++){
                sb.append(k + 1);
                if(k != i) sb.append(" ");
            }

            sb.append("\n");
        }
        System.out.print(sb);
    }
}
