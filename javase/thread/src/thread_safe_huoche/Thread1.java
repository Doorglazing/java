package thread_safe_huoche;

public class Thread1 extends Thread {
    public static void main(String[] args) {
        Train train = new Train(100);
        for(int i = 0; i < 200; i++){
            Thread1 thread1 = new Thread1(train);
            thread1.setName("T"+i);
            thread1.start();
        }

    }
    private Train tr;

    public Thread1(Train tr) {
        this.tr = tr;
    }

    @Override
    public void run() {
        tr.sale();
        System.out.println(this.getName() + ":" + tr.getCount());
    }
}
