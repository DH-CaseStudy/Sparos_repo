package day8.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(250123, "김철수"));
        studentList.add(new Student(240867, "최영희"));
        studentList.add(new Student(212932, "이동휘"));
        studentList.add(new Student(212932, "김동휘"));

        Collections.sort(studentList); //정렬

        studentList.forEach(System.out::println);



    }
}
