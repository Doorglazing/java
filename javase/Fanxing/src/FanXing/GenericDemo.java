package FanXing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("abc");
        list.add("def");
//        list.add(5);  明确为String类型
        System.out.println(list);
        //不指定类型 默认为Object类型
        // 输出 [abc,def,5]

        // 明确了类型，在使用迭代器的时候，迭代器也同样遍历元素的具体
        // 类型
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
