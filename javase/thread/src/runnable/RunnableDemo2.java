package runnable;

public class RunnableDemo2 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 500; i++){
            System.out.println("桌子"+ i);
        }
    }
}
