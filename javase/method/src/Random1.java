import java.util.Random;
import java.util.Scanner;

/**
 * new Random().nextInt(随机种子);
 * 相同随机种子随机的数在一个循环中
 */


// 猜数字小游戏
// 游戏开始 随机生成一个 1~100的随机整数 number
// 玩家会才一个数字 guessNumber 和 number进行比较
// 提示猜大还是猜小
// 统计玩家猜了几次
// 给予提示
public class Random1 {
    public static void main(String[] args) {
        rand(100);
    }
    //生成 1 <=  num  <= 100的随机数
    public static int getNum (int num){
        return new Random().nextInt(num) + 1;
    }
    public static void rand (int num){
        int add = 0;
        //记录一共猜了多少次
        int ran = getNum(num);
        //生成100个随机数的getNum方法
        int cai;
        //记录每次猜的数字
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你猜的数字");
        while (true){
            cai = scanner.nextInt();
            add++;
            //死循环出口
            if(ran == cai){
                System.out.println("恭喜你猜对了,一共用了"+ add + "次");
                break;
            }
            System.out.println(cai > ran ? "猜大了" : "猜小了");
        }
    }


}