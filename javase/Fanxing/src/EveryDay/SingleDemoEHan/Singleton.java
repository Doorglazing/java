package EveryDay.SingleDemoEHan;

/**
 *  懒汉顾名思义就是实例在用到的时候去创建，比较懒
 *  延迟初始化，
 *  单例模式
 *  解决多例对象冲突问题
 *
 */


public class Singleton {
    int i;
    private static Singleton instance;
    private Singleton(){};
    public static Singleton getInstance(){
        //特点，只是第一次生成对象，效率较高
        if(instance == null){
           instance = new Singleton();
        }
        return instance;
    }
}
