package RedBag;

import java.util.ArrayList;

public class Manage extends User {
    public Manage () {

    }
    public Manage (String userName, int leftMoney) {
        super(userName, leftMoney);
    }
    // 发红包
    public ArrayList<Integer> send(int totalMoney, int count){
        ArrayList<Integer> redList = new ArrayList<>();
        int leftMoney = super.getLeftMonney();
        if(totalMoney > leftMoney){
            System.out.println("余额不足");
        }
        super.setLeftMonney(leftMoney - totalMoney);
        int avg = totalMoney / count;
        int mod = totalMoney % count;
        for (int i = 0; i < count - 1; i++){
            redList.add(avg);
        }
        redList.add(avg + mod);
        return  redList;
    }
}
