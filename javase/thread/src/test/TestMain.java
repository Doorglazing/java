package test;

import thread.SubThread;

public class TestMain {

    public static void main(String[] args) {
        // 优先级增大只是提高了被调度到的概率
        Thread.currentThread().setPriority(10);
        SubThread subThread = new SubThread();
        subThread.start();
        // 线程是否或者
        System.out.println(subThread.isAlive());
        // 优先级是多少 默认为5
        int priority = subThread.getPriority();
        // 获取当前线程的优先级
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(priority);
        for(int i = 0; i <= 500; i++){
            System.out.println("main" + i);
        }
    }
}
