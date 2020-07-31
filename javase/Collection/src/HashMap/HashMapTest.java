package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> map  = new HashMap<>();
        map.put("吕布","貂蝉");
        map.put("吕布","大乔");// 覆盖之前的
        map.put("刘备","孙尚香");
        map.put("曹操","卞玉儿");
        System.out.println(map.get("刘备"));
        Set<String> keys = map.keySet();
        System.out.println(map.keySet());// 返回的所有键
        System.out.println(map.remove("吕布"));//返回删除此键的值
        System.out.println(map.containsKey("刘备"));//判断是否有此key
    }
}
