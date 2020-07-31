package HashMap.Poker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Poker {
    public static void main(String[] args) {
        // 创建map集合
        HashMap<Integer, String> map = new HashMap<>();
        // 花色和数字
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> number = new ArrayList<>();
        Collections.addAll(colors, "♥","♦","♠","♣");
        Collections.addAll(number, "A","2","3","4","5","6","7","8","9","10","J","Q","K");
        int count = 1;
        map.put(count++, "大王");
        map.put(count++, "小王");
        // 初始化其他牌
        for(String num : number){
            for(String color : colors){
                map.put(count++, color + num);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(map.keySet());
        Collections.shuffle(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> listDP = new ArrayList<>();
        //打乱顺序
        for(int i = 0; i < list.size(); i++){
            if(i > 50){
                listDP.add(list.get(i));
                continue;
            }
            if(i % 3 == 1){
                list1.add(list.get(i));
                continue;
            }
            if(i % 3 == 2){
                list2.add(list.get(i));
                continue;
            }
            if(i % 3 == 0){
                list3.add(list.get(i));
                continue;
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);
        Collections.sort(list3);
        Collections.sort(listDP);
        ArrayList<String> listStr1 = new ArrayList<>();
        ArrayList<String> listStr2 = new ArrayList<>();
        ArrayList<String> listStr3 = new ArrayList<>();
        ArrayList<String> listStrDP = new ArrayList<>();
        for(Integer i : list1){
            listStr1.add(map.get(i));
        }
        for(Integer i : list2){
            listStr2.add(map.get(i));
        }
        for(Integer i : list3){
            listStr3.add(map.get(i));
        }
        for(Integer i : listDP){
            listStrDP.add(map.get(i));
        }

        System.out.println(listStr1);
        System.out.println(listStr2);
        System.out.println(listStr3);
        System.out.println(listStrDP);
    }
}
