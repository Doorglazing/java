package timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) throws ParseException {
        Timer timer = new Timer();
        // 开启守护线程方式
        //  Timer timer = new Timer(true);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date firstTime = simpleDateFormat.parse("2020-03-14 09:30:00");
        // 参数： 定时任务对象  执行的第一次时间  间隔多久执行一次
//        timer.schedule(new LogTimerTask(), firstTime,1000*10);
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//
//            }
//        },firstTime ,1000%10);
    }

}
class LogTimerTask extends TimerTask{

    @Override
    public void run() {
        // 编写你需要执行的任务
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = simpleDateFormat.format(new Date());
        System.out.println(strTime+"执行了一次");
    }
}