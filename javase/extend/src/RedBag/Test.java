package RedBag;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       Manage manage = new Manage("群主", 200);
       Memory memory1 = new Memory("成员",  0);
       Memory memory2 = new Memory("成员",  0);
       Memory memory3 = new Memory("成员",  0);
       manage.show();
       memory1.show();
       memory2.show();
       memory3.show();
       Scanner scanner = new Scanner(System.in);
       System.out.println("请输入金额");
       int money = scanner.nextInt();
       System.out.println("请输入发几个红包");
       int count = scanner.nextInt();
       ArrayList<Integer> redList = manage.send( money, count);
       memory1.receive(redList);
       memory2.receive(redList);
       memory3.receive(redList);
       manage.show();
       memory1.show();
       memory2.show();
       memory3.show();
    }
}
