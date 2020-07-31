package homework;

import java.util.ArrayList;

public class CollectionTest3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(300);
        Object[] obj = listTest(list);
        int len = obj.length;
        for (int i = 0; i < len; i++) {
            System.out.println(obj[i]);
        }
    }

    public static Object[] listTest(ArrayList<Integer> list){
       Object[] obj = list.toArray();
        return obj;
    }
}
