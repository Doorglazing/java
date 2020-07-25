import java.util.HashMap;

/*
*   HashMap: 一种Map集合，用于存储映射(Map关系)元素必须是一对对象
*   键对象key = 值对象Value
*   键对象不能重复，也不能为空
*   值对象可以重复
*   可以泛型
*   可以动态变化
*   无序 添加顺序不是存储顺序
*
*   方法：
*       put(key, Value);
*       void putAll(Map m);
*       添加元素 添加Map集合 无序
*       Object get(Object key)
*       获取元素方法
*       Object remove(object key)
*       删除元素
*       转换为其他集合方法
*        Collection values()
*       将值转换为Col集合
*        Set keySet()
*       将key转换为Set
*
*       boolean containsValue(Value);
*       boolean containsKey(Key);
*
* */
public class HashMa {
    public static void main(String[] args) {
        HashMap<String, String> a = new HashMap<String, String>();
        a.put("green","绿色");
        a.put("red","红色");
        System.out.println(a.get("green"));
        System.out.println(a);
        System.out.println(a.containsKey("green"));
        a.remove("green");
        System.out.println(a.containsKey("green"));
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}
