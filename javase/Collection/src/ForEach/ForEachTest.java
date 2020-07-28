package ForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ForEachTest {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,5,6,7};
        Collection<String> arr = new ArrayList<>();
        arr.add("含浦1");
        arr.add("憨批");
        arr.add("含浦2");
        for(String i : arr){
            System.out.println(i);
        }

    }
}
