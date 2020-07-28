package baozhuanglei;

public class StringChange {
    public static void main(String[] args) {
        int a = 100;
        String b = "100";
        System.out.println(a+b); // 100100
        //包装类都有parseXxx静态方法都可以将字符串参数转化为
        // Xxx型
        int a2 = Integer.parseInt(b);
        System.out.println(a+a2);//200
        Integer a1 = Integer.valueOf(b);
        System.out.println(a1+a);//200
    }
}
