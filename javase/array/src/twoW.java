import java.util.Arrays;

public class twoW {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        int[][] arr1 = new int[6][6];
        int[][] arr2 = new int[6][];
        Object[] arr3 = new Object[5];
        //可以存对象
        arr3[0] = "你是傻逼";
        arr3[1] = 1234;
        System.out.println(Arrays.toString(arr3));
        /*
        * 可以省略列
        * */
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
