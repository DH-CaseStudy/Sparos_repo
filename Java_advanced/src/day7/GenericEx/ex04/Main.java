package day7.GenericEx.ex04;

public class Main {
    public static void main(String[] args) {
        //모든
        Course.registerCourse(new Applicant<Person>(new Person()));
        Course.registerCourse(new Applicant<Student>(new Student()));
        Course.registerCourse(new Applicant<Worker>(new Worker()));
        Course.registerCourse(new Applicant<HightStudent>(new HightStudent()));
        Course.registerCourse(new Applicant<MiddleStudent>(new MiddleStudent()));

        //학생

        Course.registerCourse2(new Applicant<Student>(new Student()));

        //직장인
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
    }
}
