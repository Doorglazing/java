package selfStudy;

public class Run {
    /**
     * 开启线程
     * 第一种方法就是继承线程类java.lang.Thread
     * 相关的方法：
     * - run():该方法用于线程的执行。在线程启动后
     *      会调用该方法。你需要重载该方法，以便让线程做特定的工作
     * - start():该方法使得线程启动run()方法
     * 第二种方法：实现Runnable接口
     * 实际上，Thread类本身也实现了Runnable接口。Runnable接口之提供了run（）方法
     *
     * 多个线程访问同一资源时，可能会引起访问冲突
     * 可以通过线程同步解决对共享资源访问的问题
     *  synchronized 返回值类型 方法名(){}
     *
     */
}
