package day6.dateEx;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx {
    public static void main(String[] args) {
        Calendar now  = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);
        int time = now.get(Calendar.AM_PM);
        int hour = now.get(Calendar.MINUTE);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(week);
        System.out.println(time);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);

        String[] avaliableIDS = TimeZone.getAvailableIDs();

    }
}
