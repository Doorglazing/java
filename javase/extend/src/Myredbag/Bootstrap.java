package Myredbag;

public class Bootstrap {
    public static void main(String[] args) {
        MyRed myRed = new MyRed("火影七班抢红包");
        RandomMode randomMode = new RandomMode();
        myRed.setOwnerName("卡卡鸡");
        myRed.setOpenWay(randomMode);
//        int a = 5555;
//        double b = (double) a / 100;
//        System.out.println(b);
    }
}
