package MathStack.PaiXu;

import java.util.Arrays;

public class QuickSort {
    //快速排序 效率比通常排序高
    public static void main(String[] args) {
        int[] arr = {6,1,2,7,9,3,4,5,10,8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int low, int high) {
        if(low > high){
            return;
        }
        int i = low,
                j = high,
                temp = arr[low],
                reser;

        while (i < j){
            //因为基准数是从左边定义的所以要从右边先找
            if(temp <= arr[j] && i < j){
                j--;
            }
            if(temp >= arr[i] && i < j){
                i++;
            }

            if(i < j){
                reser = arr[j];
                arr[j] = arr[i];
                arr[i] = reser;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        quickSort(arr,  low,  i - 1);
        quickSort(arr, i + 1, high);
    }
}
