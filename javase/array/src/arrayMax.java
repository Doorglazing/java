import java.util.Arrays;

public class arrayMax {
    public static void main(String[] args) {
        double[] arr = new double[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = Math.floor(Math.random()*90 + 10);
        }
        System.out.println(Arrays.toString(arr));
        double Max = arr[0];
        for(int i = 1; i < 10; i++) {
            if(arr[i] > Max){
                Max = arr[i];
            }
        }
        System.out.println(Max);
    }
}
