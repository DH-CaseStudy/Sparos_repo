package day8.comparator.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StudentMain {
    public static void main(String[] args) throws IOException {
        List<Student> studentList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("학생 이름을 입력하세요.");
            String name = br.readLine();

            System.out.println("학번을 입력하세요.");
            String sno = br.readLine();

            System.out.println("국어 점수를 입력하세요");
            int korean = Integer.parseInt(br.readLine());

            System.out.println("영어 점수를 입력하세요");
            int english = Integer.parseInt(br.readLine());

            System.out.println("수학 점수를 입력하세요");
            int math = Integer.parseInt(br.readLine());

            Hashtable<String, Integer> temp = new Hashtable<>();
            temp.put("국어", korean);
            temp.put("영어", english);
            temp.put("수학", math);

            int total = 0;

            for (int s : temp.values()) {
                total += s;
            }

            studentList.add(new Student(name, sno, temp, total, (double) total / 3));

            Collections.sort(studentList, Comparator.comparing(Student::getAverage));
            System.out.println("성적 오름 차순 :  \n" + studentList);

            Collections.sort(studentList, Comparator.comparing(Student::getAverage, Comparator.reverseOrder()));
            System.out.println("성적 내림 차순 :  \n" + studentList);

        }

    }
}
