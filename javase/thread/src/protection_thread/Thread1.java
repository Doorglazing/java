package protection_thread;

public class Thread1 {
    public static void main(String[] args) {
        Thread2 thread2 = new Thread2();
        //设置为守护线程 要在开启前设置
        thread2.setDaemon(true);
        thread2.start();

        for (int i=0 ; i < 10; i ++){
            System.out.println("main:"+ i);
        }
    }
}

class Thread2 extends Thread{
    int i = 0;
    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+":"+i++);
        }
    }
}