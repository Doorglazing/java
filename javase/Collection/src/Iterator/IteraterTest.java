package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteraterTest {
    public static void main(String[] args) {
        Collection<String> arr = new ArrayList<>();
        arr.add("含浦1");
        arr.add("憨批");
        arr.add("含浦2");
        Iterator<String> iterator =  arr.iterator();
        while (iterator.hasNext()){
            //指针当前位置判断hasNext()为true
            //执行next获取元素移动指针来到下一个元素之前
            String s = iterator.next();
            //返回迭代的下一个元素
//            System.out.println(s);
        }
    }
}
