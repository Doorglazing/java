package CaiNum;

import java.util.Random;
import java.util.Scanner;

public class CaiNum {
    public static void main(String[] args) {
        System.out.println("请输入要猜的范围");
        int n  = new Scanner(System.in).nextInt() + 1;
        caiNum(n);
    }
    public static void caiNum (int n) {
        Scanner scanner = new Scanner(System.in);
        int ran = new Random().nextInt(n);
        while (true){
            System.out.println("请输入您猜的数字");
            int scaNum = scanner.nextInt();
            if(scaNum == ran){
                System.out.println("恭喜你猜对了");
                return;
            }
            System.out.println(scaNum > ran ? "猜大了" : "猜小了");
        }
    }
}
