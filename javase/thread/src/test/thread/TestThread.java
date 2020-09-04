package test.thread;

import org.junit.Test;
import thread.ThreadDemo;
import thread.ThreadDemo1;

public class TestThread {
    @Test
    public void testThread(){
        ThreadDemo demo = new ThreadDemo();
        // 启动线程start
        demo.start();
        ThreadDemo1 demo1 = new ThreadDemo1();
        demo1.start();
    }
}
