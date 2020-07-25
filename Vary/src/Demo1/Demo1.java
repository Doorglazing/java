package Demo1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(arrayToString(arr));
    }
    public static String  arrayToString(int[] arr){
        String s = Arrays.toString(arr);
        return s.replace(", ", "#");
    }
}
