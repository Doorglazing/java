public class demo3 {
    public static void main(String[] args) {
        int i = 0, m = 0;
        int[] a = {};
        for (m = 0; m < 100; m++) {
            if(m % 3 == 0){
                a[i] = m;
                i++;
            }
        }
    }
}
