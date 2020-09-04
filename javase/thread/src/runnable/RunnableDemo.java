package runnable;

public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++){
            System.out.println("包饺子:" + i);
        }
    }
   
}
