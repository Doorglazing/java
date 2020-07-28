package Calender1;


import java.util.Calendar;
import java.util.Date;

public class CalenderTest {
    public static void main(String[] args) {
        //创建calendar对象
        Calendar calendar  =  Calendar.getInstance();
        Date date = new Date();
        System.out.println(date);
        System.out.println(calendar);
        //设置年
        int year = calendar.get(Calendar.YEAR);
        //范围是 0 ~ 11
        int month = calendar.get(Calendar.MONTH);

        int Day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(year);
        System.out.println(month + 1);
        System.out.println(Day);
    }
}
