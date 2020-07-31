package homework1;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("陈1", "蛤蟆皮");
        map.put("陈23", "蛤蟆皮");
        map.put("赵343", "憨批");
        for(String value : map.values()){
            System.out.println(value);
        }
        Iterator<String> ite = map.values().iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}
