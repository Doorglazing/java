package Calender1;

import java.util.Calendar;

public class CalendarTest3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        //范围是 0 ~ 11
        int month = calendar.get(Calendar.MONTH);

        int Day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(year);
        System.out.println(month + 1);
        System.out.println(Day);
        calendar.add(Calendar.DAY_OF_MONTH, 2);
        //修改
    }
}
