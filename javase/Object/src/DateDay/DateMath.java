package DateDay;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateMath {
    public static void main(String[] args) throws ParseException {
        function();
    }
    public static void function() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("请输入出生日期 格式 yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        String birth = scanner.nextLine();
        Date firstDate = simpleDateFormat.parse(birth);
        long first = firstDate.getTime();
        System.out.println(first);
        long last =  new Date().getTime();
        // new Date().getDay();
        //getDay无法使用 被标注@Deprecated

        long time = (last - first) / 1000 / 86400;
        if(time < 0){
            System.out.println("还没出生");
            return;
        }
        System.out.println(time+"天");
    }
}
