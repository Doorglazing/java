package EveryDay.SingleDemoEHan;

public class Test {
    public static void main(String[] args) {
        Singleton sl = Singleton.getInstance();
        Singleton sl1 = Singleton.getInstance();
        sl.i = 1;
        System.out.println(sl1.i);
    }
}
