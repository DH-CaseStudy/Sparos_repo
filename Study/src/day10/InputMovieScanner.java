package day10;

import java.util.Scanner;

public class InputMovieScanner {
    static final Scanner sc = new Scanner(System.in);

    public MovieDTO inputObject(MovieDTO movie){
        System.out.println("제목");
        movie.title = sc.nextLine();
        System.out.println("개봉일");
        movie.startDate = sc.nextInt();
        sc.nextLine();
        System.out.println("배우");
        movie.actor = sc.nextLine();
        System.out.println("상영시간");
        movie.runningTime = sc.nextLine();
        System.out.println("등급");
        movie.grade = sc.nextLine();
        return movie;
    }
}
