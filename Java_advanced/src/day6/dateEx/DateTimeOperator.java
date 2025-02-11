package day6.dateEx;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//LocalDateTime 클래스는 시간을 조작할 수 있게 기능을 제공한다.
public class DateTimeOperator {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.toString());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd aHH:mm:ss");
        System.out.println(now.format(dtf));

        LocalDateTime result1 = now.plusYears(1);

        System.out.println("1년 후 현재시간 : " + result1.format(dtf));

        LocalDateTime result2 = now.plusMonths(1);
        System.out.println(result2);
        LocalDateTime result3 = now.plusWeeks(1);
        System.out.println(result3);
        LocalDateTime result4 = now.plusDays(1);
        System.out.println(result4);
    }
}
