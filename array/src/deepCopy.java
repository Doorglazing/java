import java.util.Arrays;

public class deepCopy {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = new int[a.length];
        for(int i = 0 ; i < a.length; i++){
            b[i] = a[i];
        }
        b[0] = 10;
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));
    }
}
