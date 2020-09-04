package thread;

public class ThreadDemo1 extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 100; i++){
            System.out.println("客人:"+ i);
        }
    }
}
