package homework;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    final String[] color = {"♥","♦","♠","♣"};
    final String[] number = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    //洗牌
    public ArrayList<String> xiPai(){
        ArrayList<String> list = new ArrayList<>();
        for(String i : color){
            for (String j : number){
                list.add(i+j);
            }
        }
        list.add("大王");
        list.add("小王");
        System.out.println(list.size());
        Collections.shuffle(list);
        return list;
    }
    //发牌
    public ArrayList[] faPai(ArrayList<String> list){
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();
        int len = list.size();
        for (int i = 0; i < len; i++) {
            if(i >= len - 3){
                list4.add(list.get(i));
                continue;
            }
            if(i % 3 == 0){
                list1.add(list.get(i));
                continue;
            }
            if(i % 3 == 2){
                list2.add(list.get(i));
                continue;
            }
            if(i % 3 == 1){
                list3.add(list.get(i));
                continue;
            }
        }
        ArrayList[] arr = {list1, list2, list3, list4};
        return arr;
    }
    public static void main(String[] args) {
        DouDiZhu ddz = new DouDiZhu();
        ArrayList<String> list = ddz.xiPai();
        ArrayList[] listArr = ddz.faPai(list);
        for( ArrayList<String> li : listArr){
            System.out.println(li);
        }
    }
}
