package RedBack;

import java.util.Scanner;

public class Manager {
    int moneyM = 200;
    int num = 0;
    int fa;

    Scanner getMoney = new Scanner(System.in);
    void faRed (){
        System.out.println("请输入金额");
        fa += getMoney.nextInt();
        System.out.println("请输入发几个红包");
        num += getMoney.nextInt();
        System.out.println("用户群主余额问为"+ (moneyM - fa) +"元");

    }
}
