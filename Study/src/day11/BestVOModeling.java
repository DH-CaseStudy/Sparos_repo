package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class BestVOModeling {
    public static void main(String[] args) {
        ArrayList<MovieVO> movieArray = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 2; i++){
            System.out.printf("제목을 입력하세요 : ");
            String title = sc.nextLine();
            System.out.printf("날짜를 입력하세요 : ");
            int date = sc.nextInt();
            sc.nextLine();
            System.out.printf("배우를 입력하세요 : ");
            String actor = sc.nextLine();
            System.out.printf("장르를 입력하세요 : ");
            String genre = sc.nextLine();
            System.out.printf("상영시간을 입력하세요 : ");
            int time = sc.nextInt();
            sc.nextLine();
            System.out.printf("등급을 입력하세요 : ");
            String grade = sc.nextLine();

            movieArray.add(i, new MovieVO(title, date, actor, genre, time, grade));
        }

        System.out.println(movieArray);

    }
}
