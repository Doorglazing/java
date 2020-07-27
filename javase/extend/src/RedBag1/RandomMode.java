package RedBag1;

import RedBag1.utils.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount){
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        // 分别带表剩余的钱 和 剩下抢红包的次数
        int leftMoney = totalMoney;
        int leftCount = totalCount;
        // 随机发钱 n-1个,最后一个不需要随机
        /**
         * 最少一分钱,  最多不超过剩下金额平均数的两倍
         * 在发红包时，要越发越少
         */
        for (int i = 0; i < totalCount - 1; i++) {
            //随机出来的金额
            int money = random.nextInt(leftMoney/leftCount *2) + 1;
            list.add(money);
            leftCount--; //剩下的份数2,每次减1
            leftMoney -= money; //
        }
        // 处理最后一个
        System.out.println(list);
        list.add(leftMoney);
        return list;
    }
}
