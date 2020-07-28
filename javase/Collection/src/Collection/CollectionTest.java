package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> arr = new ArrayList<>();
        arr.add("含浦1");
        arr.add("憨批");
        arr.add("含浦2");
        arr.remove("憨批");
        System.out.println(arr.isEmpty());
        System.out.println(arr.size());
        Object[] objects = arr.toArray();
        System.out.println(Arrays.toString(objects));
        arr.clear();
        System.out.println(arr.isEmpty());
        System.out.println(arr);
    }
}
