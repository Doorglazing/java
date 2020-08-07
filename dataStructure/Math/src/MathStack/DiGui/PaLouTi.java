package MathStack.DiGui;

public class PaLouTi {
    // 爬楼梯
    // 你一次可以 爬 1阶 或 2阶
    // 事例
    // 0 -- > 2
    // 1 + 1
    // 2
    // 0 --> 3
    // 1 + 1 + 1
    // 1 + 2
    // 2 + 1
    public static void main(String[] args) {
        //优化
        int arr[] = new int[40];
        System.out.println(pLTest(5, arr));
        System.out.println(plTest1(5));
    }
    public static int pLTest(int i, int[] arr){
        // 记忆性递归  空间 换 时间
        if( i == 1){
            return 1;
        }
        if(i == 2){
            return 2;
        }
        if(arr[i-1] > 0){
            return arr[i - 1];
        }
        arr[i - 1] = pLTest(i - 1, arr) + pLTest(i - 2, arr);
        return arr[i - 1];
    }

    public static int plTest1 (int i){
        // 普通形式递归
        if(i == 1){
            return 1;
        }
        if(i == 2){
            return 2;
        }
        return plTest1(i - 1) + plTest1(i - 2);
    }
}
