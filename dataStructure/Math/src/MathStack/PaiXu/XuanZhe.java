package MathStack.PaiXu;

import java.util.Arrays;

public class XuanZhe {
    public static void main(String[] args) {
        int[] arr = {1,233,546,43,2};
        System.out.println(Arrays.toString(xuanZhe(arr)));
    }
    public static int[] xuanZhe(int arr[]){
        // 选择排序
        int len = arr.length;
        int Max = arr[0];
        int index = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if(arr[i] < arr[j]){
                    Max = arr[j];
                    arr[j] = arr[i];
                    arr[i] = Max;
                }
            }
        }

        return arr;
    }
}
