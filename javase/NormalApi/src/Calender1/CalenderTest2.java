package Calender1;

import java.util.Calendar;

public class CalenderTest2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.YEAR, 1998);
        System.out.println(calendar.get(calendar.YEAR));
    }
}
