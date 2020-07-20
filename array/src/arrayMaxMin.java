import java.util.Arrays;

public class arrayMaxMin {
    public static void main(String[] args) {
        double[] arr = new double[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = Math.floor(Math.random()*90 + 10);
        }
        System.out.println(Arrays.toString(arr));
        double a;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 9; j++){
                if(arr[j] > arr[j+1]){
                    a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
