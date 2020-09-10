package thread_safe_huoche;

public class Train {
    private int count;

    public synchronized void sale(){
        if(count == 0){
            System.out.println("购票失败，没有票了");
            return;
        }else {
//            System.out.println("购买成功");
            this.setCount(--count);
        }

    }
    public Train(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
