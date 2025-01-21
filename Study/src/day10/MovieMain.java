package day10;

public class MovieMain {
    public static void main(String[] args) {
        MovieDTO movie1 = new MovieDTO();
        movie1.title = "검은 수녀들";
        movie1.startDate = 20250105;
        movie1.actor = "송혜교";
        movie1.runningTime = "150m";
        movie1.grade = "15";

        movie1.moviePrint(movie1);

        MovieDTO movie2 = new MovieDTO();
        movie2.title = "히트맨2";
        movie2.startDate = 20250122;
        movie2.actor = "권상우, 정준호, 이이경, 황우슬혜, 김성오, 이지원";
        movie2.runningTime = "118m";
        movie2.grade = "15";

        movie2.moviePrint(movie2);

    }
}
