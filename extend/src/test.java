import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        for(int i : a){
            i = 4;
        }
        System.out.println(Arrays.toString(a));
    }
}
