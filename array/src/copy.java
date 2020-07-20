import java.util.Arrays;

public class copy {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4,5};
        int[] b = new int[] {11,12,13,14,15,16,17,18,19,20};

        //   参数 (被复制数组,被复制数组的起始下标,目标数组,目标数组替换的起始下标,复制的个数)
        System.arraycopy(a,0,b,2,5);
        System.out.println(Arrays.toString(b));
    }

}
