package homework1;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("陈1", "蛤蟆皮");
        map.put("陈23", "蛤蟆皮");
        map.put("赵343", "憨批");
        System.out.println(map.get("陈1"));//蛤蟆皮
        System.out.println(map.remove("赵343"));//憨批
        System.out.println(map); //{陈1=蛤蟆皮，陈23=蛤蟆皮}
    }
}
