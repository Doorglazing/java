package Date;

import java.util.Date;
import java.util.Timer;

public class DateTest {
    public static void main(String[] args) {
        //创建日期对象,返回当前对象
        System.out.println(new Date());
        //Mon Jul 27 15:20:26 CST 2020
        //创建日期对象，把当前的毫秒值转化成日期对象
        System.out.println(new Date(0l));
        //Thu Jan 01 08:00:00 CST 1970
        //把日期对象转化为对应的时间毫秒值
        System.out.println(new Date().getTime());

    }
}
