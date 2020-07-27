package Myredbag;

import Myredbag.utils.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < totalCount - 1; i++) {
            int money = random.nextInt(leftMoney / leftCount * 2);
            list.add(money);
            leftCount--;
            leftMoney -= money;
        }
        list.add(leftMoney);
        return list;
    }
}
