import java.util.Arrays;
//不对
public class three {
    public static void main(String[] args) {
        int num = 0;
        double[] arr = new double[500];
        for (int i = 0; i < 500; i++) {
            arr[i] = Math.floor(Math.random()*90 + 10);
        }
        int nub = 500;
        int i = 0;
        int len = arr.length;
//        System.out.println(len);
        while(nub > 1){
            if(arr[i] != 0){
                num ++;
            }
            if(num == 3){
//                System.out.println(i);
                arr[i] = 0;
                nub --;
                num = 0;
            }
            i ++;
            if(nub == 1){
                System.out.println(i);
                break;
            }
            if(i == len - 1) {
                i = 0;
            }

        }
    }
}
