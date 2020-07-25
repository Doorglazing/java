/*
*   java语言特点 ：
*       速度快，跨平台（可移植性性好）
*       分布式，面向对象
*       多线程
*
*
*
* */



public class demo1 {
    public static void main(String[] args) {
        //int 整形
        //double 双字 带小数 浮点型
        //float?
        //char 字符
        //String 字符串
        int a = 123;
        int b = 234;
        double a1 = 123.123;
        char c = '&';
        String s = "hello world";
        boolean bl = false;
        boolean bl1 = true;
        //a++  --> a = a + 1;在逻辑之后执行
        a = a++;
        System.out.println(a);
        System.out.println(bl||bl1);
        de d = new de();
        d.study(1);
    }
}
class de extends d {
    void study(int i){
        System.out.println("goodgoodstudy daydayup" + 1);
    }
}
abstract class d{
    abstract void study(int a) ;
}