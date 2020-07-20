import java.util.Arrays;
import java.util.Comparator;

public class sort {
    public static void main(String[] args) {
        /*
        *   数组排序方法
        *   俩种用法
        *   1.Arrays.sort(数组) 自动排序 从小到大
        *
        *   2.Arrays.sort(数组,起始地址，终止地址+1)  第三个参数的下标所对应的数值不参与排序
        *
        *   3.如何从大到小排序
        *       Comparator cmp = new myComparator();
        *       //建立自己的class  myComparator 实现反转
        *       Arrays.sort(数组, cmp);
        *
        * */
        int [] a = {1,5,2,4,6,8,9,4,1};
        Arrays.sort(a,2,9);
        System.out.println(Arrays.toString(a));
//        Comparator tem = new MyComparator();


     }
}
