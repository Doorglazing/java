package Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3 {
    public static void main(String[] args) throws ParseException {
        String S = "1999-01-04";
        timerFormat(S);
    }
    public static void timerFormat(String str) throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
        Date date = simpleDateFormat.parse(str);
        System.out.println(date);
    }

}
