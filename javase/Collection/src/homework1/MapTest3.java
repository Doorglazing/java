package homework1;

import java.util.HashMap;

public class MapTest3 {
    public static void main(String[] args) {
        String[] province = {"黑龙江","浙江省","江西省","广东省","福建省"};
        String[] area = {"哈尔滨","杭州","南昌","广州","福州"};
        System.out.println(mapMethod(province,area));
    }
    public static HashMap<Object, Object> mapMethod (Object[] province, Object[] area){
        HashMap<Object, Object> map = new HashMap<>();
        int len = province.length;
        for (int i = 0; i < len; i++) {
            map.put(province[i], area[i]);
        }
        return map;
    }
}
