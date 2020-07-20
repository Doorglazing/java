import java.util.Scanner;


public class scannerTest {
    public static void main(String[] args) {
        /**
         *  Scanner 类
         *      引用类型的基本使用
         *          1、导包(Java.lang不用导,)
         *              import 报名.类名;
         *          2、创建对象
         *              数据类型 变量名 = new 数据类型(参数列表);
         *          3、-调用方法
         *              变量名.方法名(参数列表);
         *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入3个数");
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        i = i > j ? i : j;
        i = i > k ? i : k;
        System.out.print("最大数为："+ i);
        //在键盘中输入3个数据，获取最大值
    }
}
