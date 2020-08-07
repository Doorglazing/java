import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class One {
    /**
     *
     * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
     * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
     * 问每个月的兔子对数为多少？
     * 斐波那契数列 1 1 2 3 5 8
     * 使用记忆性递归
     */
    public static void main(String[] args){
        int[] arr = new int[40];
        System.out.println(mathOne(7, arr));
    }
    public static int mathOne(int n, int[] arr){
        if(n == 1 || n == 2){
            return 1;
        }
        if(arr[n-1] != 0){
            return arr[n-1];
        }
        arr[n - 1] = mathOne(n - 1, arr) + mathOne(n - 2, arr);
        return arr[n - 1];
    }

}
