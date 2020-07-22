package homework2;

import java.util.ArrayList;
import java.util.Random;

public class RandomPK {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list = randomP(3);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
    public static ArrayList<String> randomP(int n){
        ArrayList<String> list2 = new ArrayList<>();
        if(n > 52){
            list2.add("超越范围，无法获取");
            return list2;
        }
        ArrayList<String> list3 = new ArrayList<>();
        String[] number = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] flo = {"方片","黑桃","梅花","红桃"};
        Random random =new Random();
        for (int i = 0; i < flo.length; i++) {
            for (int j = 0; j < number.length; j++) {
                list2.add(flo[i] + number[j]);
            }
        }
        list2.add("大王");
        list2.add("小王");
        //把移除的牌保存到新集合
        int x = 54;
        //最大牌数
        System.out.println("随机"+ n +"张牌");
        for (int i = 0; i < n; i++) {
            list3.add(list2.remove(random.nextInt(x + 1)));
            x--;
        }
        return list3;
    }
}
