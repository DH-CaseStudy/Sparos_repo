package day7.GenericEx.ex04;

public class Course {

    //person 이면 수강 등록 가능
    public static void registerCourse(Applicant<?> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course1을 등록함");
    }

    //학생만
    public static void registerCourse2(Applicant<? extends Student> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course1을 등록함");
    }

    public static void registerCourse3(Applicant<? super Worker> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course3을 등록함");
    }

    //직장인 및 일반인만
}
