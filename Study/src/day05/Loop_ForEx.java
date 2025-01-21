package day05;

import java.util.Scanner;

public class Loop_ForEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int length = sc.nextInt();

        for(int i = 0; i < length; i++){
            for(int j = 0; j < i; j++){
                sb.append(" ");
            }

            for(int j = 0; j < (2*length)-1-(i*2); j++){
                sb.append("*");
            }

            sb.append("\n");


        }

        System.out.println(sb);
    }
}

