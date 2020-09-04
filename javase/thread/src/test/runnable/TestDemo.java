package test.runnable;

import org.junit.Test;
import runnable.RunnableDemo;
import runnable.RunnableDemo1;
import runnable.RunnableDemo2;

public class TestDemo {
    @Test
    public void runnableTest(){
        RunnableDemo demo = new RunnableDemo();
        Thread thread = new Thread(demo);
        thread.start();
        RunnableDemo1 demo1 = new RunnableDemo1();
        Thread thread1 = new Thread(demo1);
        thread1.start();
        RunnableDemo2 demo2 = new RunnableDemo2();
        Thread thread2 = new Thread(demo2);
        thread2.start();
    }
}
