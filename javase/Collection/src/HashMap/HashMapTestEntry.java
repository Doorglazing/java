package HashMap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTestEntry {
    public static void main(String[] args) {
        HashMap<String, String> map  = new HashMap<>();
        map.put("吕布","貂蝉");
        map.put("吕布","大乔");// 覆盖之前的
        map.put("刘备","孙尚香");
        map.put("曹操","卞玉儿");
        map.putIfAbsent("吕布", "貂蝉");//如果有不会覆盖
        Set<Entry<String, String>> entrySet = map.entrySet();
        for(Entry entry: entrySet){
            System.out.println(entry.getKey()+":"+entry.getValue());
            System.out.println(entry);
        }
    }
}
