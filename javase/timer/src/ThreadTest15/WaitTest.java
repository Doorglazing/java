package ThreadTest15;


//实现交替输出

public class WaitTest {
    public static void main(String[] args) {
        Num num = new Num();
        Thread thread = new Thread(new first(num));
        Thread thread2 = new Thread(new two(num));
        thread.setName("t1");
        thread2.setName("t2");

        thread.start();
        thread2.start();
    }
}

class first implements Runnable{
    private Num num;
    first (Num num){
        this.num = num;
    }
    @Override
    public void run() {
       while (true){
           synchronized (num){
               if(num.i % 2 == 0){
                   try {
                       num.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
               System.out.println(Thread.currentThread().getName()+"-->"+ num.i++);
               num.notify();
           }
       }
    }
}

class two implements Runnable{
    private Num num;
    two (Num num){
        this.num = num;
    }
    @Override
    public void run() {
        while (true){
            synchronized (num){
                if(num.i % 2 == 1){
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() +"-->" + num.i++);
                num.notify();
            }
        }
    }
}
class Num {
    int i = 1;
}