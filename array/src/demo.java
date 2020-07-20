import java.util.Arrays;
import java.util.Scanner;

public class demo {

    /*
    * 定义数组
    *   数据类型[] 数组名 = new 数据类型[数组大小];
    *   数据类型[] 数组名 = {1,2,3,4,5};
    *   数组的属性 数组名.length   获取数组长度(最大下标+1)
    *   数组异常 ：常见下标越界  空指针异常
    *   数组索引越界：ArrayIndexOutofBoundsException
    *
    *   int[] arr = null;
    *   空指针异常 NullPointerException
    *   Arrays.toString(array);
    *   将数组转换为字符串输出
    *   int 占 4个字节(byte) 1byte = 8 bit;
    *   short 占 2个字节
    *
    *
    *
    *
    *   增强for循环
    *       for(数据类型 变量名： 数组名){
    *
    *       }
    * */
    public static void main(String[] args) {
        double[] array = new double[10];
        int len = array.length;
//        Scanner a = new Scanner(System.in);
//        int b = a.nextInt();
//        System.out.println(b);
        for(int i = 0; i < len; i++){
            array[i]= Math.floor(Math.random() * 90 + 10);
        }


        //遍历array中的元素
        for (double a : array) {
            //无法改变a的值

            System.out.println(a);
        }
        System.out.printf(Arrays.toString(array));
    }
}
