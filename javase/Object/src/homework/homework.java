package homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class homework {
    //使用SimpleDateFormat类，把2018-03-04转换为2018年03月04日;
    public static void main(String[] args) throws ParseException {
        System.out.println(new SimpleDateFormat("yyyy年MM月dd日")
                .format(new SimpleDateFormat("yyyy-MM-dd").parse("2018-03-04")));
    }
}
