package baozhuanglei;

public class BaoZhuangdemo {
    public static void main(String[] args) {
        Integer i = new Integer(4); //Java9 过时
        Integer integer = Integer.valueOf(4);// 基本-->包装
        int i1 = i.intValue();// 包装 --> 基本 拆箱

    }
}
