package homework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest4 {
    public static void main(String[] args) {
        //定义集合，添加数据
        ArrayList<String> list = new ArrayList<String>();
        list.add("haha");
        list.add("python");
        list.add("java");
        System.out.println(listTest(list,"java"));
    }
    public static boolean listTest(Collection<String> list, String str){
            return list.contains(str);
    }
}
