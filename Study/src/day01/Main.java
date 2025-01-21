package day01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1. Korea");
            System.out.println("2. USA");
            System.out.println("3. japan");
            System.out.println("4. China");
            System.out.println("number? ");

            int num = sc.nextInt();

            if(num == 1){
                System.out.println("Seoul");
            } else if(num == 2){
                System.out.println("Washington");
            } else if(num == 3){
                System.out.println("Tokyo");
            } else if(num == 4){
                System.out.println("Beijing");
            } else if(num >= 5 || num < 0) {
                System.out.println("none");
                break;
            }
        }

    }
}