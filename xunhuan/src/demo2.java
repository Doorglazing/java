import java.util.Scanner;

public class demo2 {
    public static void main(String[] args){
        //输入流对象
        Scanner a = new Scanner(System.in);
        //输入流对象方法
        String s = a.next();
        //字符串转换为整数型
        //整数型转换成字符串  s = b.toString();
        int b = Integer.parseInt(s);
        System.out.println(b % 10 * 1000 + b / 10 % 10 * 100 + b / 100 % 10 * 10 + b/1000);
    }
}
