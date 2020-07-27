package RedBag1;


//红包启动程序

/**
 * 普通红包起飞:
 */
public class Bootstrap {
    public static void main(String[] args) {
        //设置标题
        MyRed myRed = new MyRed("火影七班抢红包");

        //设置群主名
        myRed.setOwnerName("卡卡鸡");
        //设置分发策略
        NormalMode normalMode = new NormalMode();
        RandomMode randomMode = new RandomMode();
//        myRed.setOpenWay(normalMode);
        myRed.setOpenWay(randomMode);
    }
}
