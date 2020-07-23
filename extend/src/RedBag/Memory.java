package RedBag;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Random;

public class Memory extends User{
    public Memory(){}
    public Memory(String userName, int leftMoney){
        super(userName, leftMoney);
    }

    //收红包
    public void receive(ArrayList<Integer> list){
        Random random = new Random();
        int index = random.nextInt(list.size());
        Integer removeMoney = list.remove(index);
        int leftMoney = super.getLeftMonney();
        int updateMoney = leftMoney + removeMoney;
        super.setLeftMonney(updateMoney);
    }
}
