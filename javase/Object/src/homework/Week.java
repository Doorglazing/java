package homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Week {
    public static void main(String[] args) throws ParseException {
        switch (((int)(new SimpleDateFormat("yyyy-MM-dd")
                .parse("2018-02-14").getTime()/ 1000 / 86400) )% 7 - 3){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            default:
                System.out.println("周末");
                break;
        }
    }
}
