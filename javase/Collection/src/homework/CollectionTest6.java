package homework;

import java.util.ArrayList;

public class CollectionTest6 {
    public static void main(String[] args) {
        //定义集合，添加数据
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(5);
        System.out.println(listTest(list, 5));
    }
    public static int listTest(ArrayList<Integer> list, Integer s){
        return list.indexOf(s);
    }
}
