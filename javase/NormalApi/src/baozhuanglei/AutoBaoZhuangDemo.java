package baozhuanglei;

public class AutoBaoZhuangDemo {
    public static void main(String[] args) {
        Integer i = 5; // 自动装箱
        System.out.println(i);
        i = i + 5; // 自动拆箱
        int a = 100;

        //自动装箱成字符串
        System.out.println("a的值" + a);
    }
}
