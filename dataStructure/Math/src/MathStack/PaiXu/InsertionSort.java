package MathStack.PaiXu;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {6,1,2,7,9,3,4,5,10,8};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] insertionSort(int[] arr){
        // 记录当前查找的数字
        int cur;
        // 从1开始  假设 0 已经是排好的
        for (int i = 1; i < arr.length; i++) {
            cur = arr[i];
            // 准备查找 i 之前的数字 如果有比i大的往后移动一位
            int index = i - 1;
            // 索引最小为0 并且 在此索引
            while (index >= 0 && arr[index] > cur){
                arr[index + 1] = arr[index];
                index --;
            }
            arr[++index] = cur;
        }
        return arr;
    }
}
