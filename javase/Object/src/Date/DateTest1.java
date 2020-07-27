package Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateTest1 {
    public static void main(String[] args) throws ParseException {
        String str = "2001年6月6日";
        DateFormat date = new SimpleDateFormat("yyyy年M月d日");
        System.out.println(date.parse(str));
        //Wed Jun 06 00:00:00 CST 2001
    }
}
