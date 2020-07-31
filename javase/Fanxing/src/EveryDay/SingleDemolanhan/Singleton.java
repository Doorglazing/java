package EveryDay.SingleDemolanhan;

public class Singleton {
    /**
     *  恶汉
     *  浪费内存空间
     *  单例模式
     *  先创建好对象
     *
     */
    private Singleton (){}
    private static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }
}
