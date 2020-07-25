import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/*
*  方法
*   retainAll(Collection);
*   得到交集并删除其他元素
*   contains(Obj);
*   判断该元素是否存在
*   containsAll(obj);
*   判断obj是否为自集
*   转换为其他类型
*   Iterator iterator();
*   Object[] toArray();
* */
public class Hashse {
    public static void main(String[] args) {
        HashSet<String> a = new HashSet<String>();
        a.add("第一个元素");
        a.add("第一个元素");
        ArrayList<String> b = new ArrayList<String>();
        b.add("第二个元素");
        b.add("第三个元素");
        b.add(null);
        a.addAll(b);
        demo zh = new demo();
        zh.p1(a);
        demo1 zh1 = new demo1();
        zh1.p2(a);
        a.clear();
        System.out.println(a.isEmpty()? "是空的" : "不是空的") ;
    }
}
class demo {
    void p1(HashSet a){
        Object b[] = a.toArray();
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }
}
class demo1 {
    void p2(HashSet a){
        Iterator<String> b = a.iterator();
        while(b.hasNext()){
            String temp = b.next();
            System.out.println(temp);
        }
    }
}