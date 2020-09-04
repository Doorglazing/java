package thread;

public class ThreadDemo extends Thread {


    @Override
    public void run() {
        // 包饺子
        for(int i = 1; i <= 100; i++){
            System.out.println("包饺子:"+ i);
        }
    }
}
