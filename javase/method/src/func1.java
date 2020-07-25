import java.util.Arrays;

public class func1 {
    public static void main(String[] args) {
        //给定一个数组 求数组中最大的元素
        int[] a = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arrayMax(a)));
        System.out.println(Arrays.toString(reverse(a)));
        System.out.println(printArray(a));
    }
        //为啥要带static
    public static int[] arrayMax(int[] a){
        int[] max = new int[1];
        max[0] = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > max[0]){
                max[0] = a[i];
            }
        }
        return max;
    }

    //将数组反转.
    public static int[] reverse (int[] a){
        int num;
        int len = a.length;
        for(int i = 0; i < len/2; i++){
            num = a[i];
            a[i] = a[len - 1 - i];
            a[len - 1 - i] = num;
        }
        return a;
    }
    public static String printArray(int[] arr){
        String str = "[";
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length-1){
                str += arr[i];
                break;
            }
            str += arr[i] + "," + " ";
        }
        str += "]";
        return str;
    }
}
