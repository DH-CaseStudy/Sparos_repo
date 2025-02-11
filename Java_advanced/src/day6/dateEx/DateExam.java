package day6.dateEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {
    public static void main(String[] args) {
        SimpleDateFormat now1 = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss");
        String now2 = now1.format(new Date());
        System.out.println(now2);
    }
}
