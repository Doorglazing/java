package runnable;

public class RunnableDemo1 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 50; i++){
            System.out.println("客人" + i);
        }
    }
}
