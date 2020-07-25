public class demo1 extends demo{
    demo1() {
        super(1);
        System.out.println("子类");
    }

    void study (double x){
        super.study("wudi");
        //无法在静态类中调用
        System.out.println(x);

    }
    int add(int a, int b){
        return a * b;
    }
    //如果父类有参数 则可以用super来 调用父类以达到相同效果
    public static void main(String[] args) {
        demo1 a = new demo1();

        a.study("无敌");
        a.study(1.1);


    }
}
