package homework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest5 {
    public static void main(String[] args) {
        //定义集合，添加数据
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        System.out.println(listTest(list));
    }
    public static boolean listTest(Collection<String> list){
        return list.isEmpty();
    }
}
