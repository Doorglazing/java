package MathStack.DiGui;

public class Fbnq {
    // 斐波那契数列数列
    public static void main(String[] args) {
        int[] arr = new int[40];
        System.out.println(fbnqMath(5));
        System.out.println(fbnqMath1(5, arr));
    }

    public static int fbnqMath(int num){
        if(num == 2 || num == 1){
            return 1;
        }
        return fbnqMath(num - 1) + fbnqMath(num - 2);
        //此方法有很多重复点所以效率不高 所以改动下
        // 5 --> 4 3
        // 4 --> 3 2  3 --> 2 1
        // 3 --> 2 1   2-->1  1 -->1
    }
    // 记忆性递归
    public static int fbnqMath1(int num, int[] arr){
        if(num == 1 || num == 2){
            return 1;
        }
        //改动后的斐波那契   以空间换时间
        if(arr[num - 1] > 0){
            return arr[num - 1];
        }
        arr[num - 1] = fbnqMath1(num - 1, arr) + fbnqMath1(num - 2, arr);
        return arr[num -1];
    }
}
