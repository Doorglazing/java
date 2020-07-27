package Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {
    public static void main(String[] args) throws ParseException {
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()));
        // 2020-07-27 16:11:16
        System.out.println(simpleDateFormat.parse(simpleDateFormat.format(new Date())));
        // 反解析 Mon Jul 27 16:13:40 CST 2020
    }
}
