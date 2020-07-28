package Calender1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;

public class CalendarGetActualMaxiumTest {
    public static void main(String[] args) throws ParseException {
        //calendar.getActualMaximum();//获取给定日历最大的可能值
        getLastDay("2020-06");
        lastDay(2020,7);
    }
    public static void getLastDay(String yearmonth) throws ParseException {
        Date date =new SimpleDateFormat("yyyy-MM").parse(yearmonth);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println( calendar.getActualMaximum(calendar.DAY_OF_MONTH));
    }
    public static void lastDay(int year, int month){
        Calendar calendar = Calendar.getInstance();
        calendar.clear();//清除所有日期数据
        calendar.set(calendar.YEAR, year);
        calendar.set(calendar.MONTH, month - 1);
        System.out.println(calendar.getActualMaximum(calendar.DAY_OF_MONTH));
    }
}
