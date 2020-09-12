package ThreadTest15;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 实现线程的第三种方法：
 *    实现Callable
 */
public class CallableThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 第一步： 创建一个“未来任务类”对象。
        // 参数需要给一个Callable接口实现类对象
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
//            call方法相当于run方法，只不过有返回值
//            执行一个任务之后可能会有一个执行结果
//            模拟执行
                int a = 100;
                int b = 200;
                Thread.sleep(10000);
                return a+b; // 自动装箱为Integer
            }
        });
//        创建线程
        Thread t = new Thread(task);
//        启动线程
        t.start();
        // 此时因为get拿另一个方法的结果
        // 所以会被阻塞
        // 所以Callable效率低
        // 优点是可以拿到返回值
        Object o = task.get();
        System.out.println("hello world");
    }

}
