package day06;

import java.util.Scanner;

public class ContinueEx {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        for(int i = 0; i < num; i++){

            for(int j = 0; j < i; j++){
                sb.append(" ");
            }

            for(int k = 0; k < (2 * (num - i) - 1); k++){
                sb.append("*");
            }

            sb.append("\n");
        }

        System.out.println(sb);

    }

}
