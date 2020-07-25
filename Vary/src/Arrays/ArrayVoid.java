package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayVoid {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] =  new Random().nextInt(100);
        }

        System.out.println( Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println( Arrays.toString(arr));
    }
}
