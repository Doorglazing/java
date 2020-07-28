package System;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
        int src[] = new int[]{1,2,3,4,5,6};
        int dest[] = new int[]{10,9,8,7,6,5};
        //将src 数组中前3个元素，赋值到dest的前三个上
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));
        //[1,2,3,7,6,5]
    }
}
