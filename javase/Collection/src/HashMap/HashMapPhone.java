package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPhone {
    public static void main(String[] args) {
        HashMap<String, String> phones = new HashMap<>();
        phones.put("Mate40","HUAWEI");
        phones.put("IPONE11PRO","Ping果");
        phones.put("p40pro", "HUAWEI");
        phones.put("miFans", "雷军");
        System.out.println(phones.remove("p40pro"));
        System.out.println(phones.containsKey("Mate40"));
        System.out.println(phones.keySet());
        phones.isEmpty();
        System.out.println(phones.size());
        System.out.println(phones.get("miFans"));
        System.out.println(phones.replace("Mate40","旗舰HUAWEI")); // 更改键中的值
        System.out.println(phones);
        Set<Entry<String, String>> phonesEntry =  phones.entrySet();
        for(Entry<String, String> entry : phonesEntry){
//            System.out.println(entry.getKey());//循环获取所有键
//            System.out.println(entry.getValue());//循环获取所有值
//            System.out.println(entry);
//            System.out.println(entry.setValue("ff"));
//            System.out.println(entry);
//            Entry e = entry;
//            System.out.println(entry.equals(e));
        }
    }
}
