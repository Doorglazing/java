package HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest1 {
    public static void main(String[] args) {
        HashMap<String, String> map  = new HashMap<>();
        map.put("吕布","貂蝉");
        map.put("吕布","大乔");// 覆盖之前的
        map.put("刘备","孙尚香");
        map.put("曹操","卞玉儿");
        for(String key : map.keySet()){
            System.out.println(map.get(key));
        }

    }
}
