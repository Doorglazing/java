package MathStack.PaiXu;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {1,233,546,43,2};
        System.out.println(Arrays.toString(bubble(arr)));
    }

    public static int[] bubble(int arr[]){
        //冒泡排序
        int len = arr.length;
        int Max;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1; j++) {
                if(arr[j] < arr[j+1]){
                    Max = arr[j+1];
                    arr[j+i] = arr[j];
                    arr[j] = Max;
                }
            }
        }


        return arr;
    }
}
