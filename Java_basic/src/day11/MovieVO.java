package day11;

public class MovieVO {
    private String title;
    private int date;
    private String actor;
    private String genre;
    private int time;
    private String grade;

    public MovieVO(String title, int date, String actor, String genre, int time, String grade) {
        this.title = title;
        this.date = date;
        this.actor = actor;
        this.genre = genre;
        this.time = time;
        this.grade = grade;
    }

    public String getTitle() {
        return title;
    }

    public int getDate() {
        return date;
    }

    public String getActor() {
        return actor;
    }

    public String getGenre() {
        return genre;
    }

    public int getTime() {
        return time;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", actor='" + actor + '\'' +
                ", genre='" + genre + '\'' +
                ", time=" + time +
                ", grade='" + grade + '\'' +
                '}' + "\n";
    }
}
