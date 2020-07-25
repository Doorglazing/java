public class seven {
    public static void main(String[] args) {
        double num = 0;
        double fo = 0;
        num = 2 + 1.5;
        for(int i = 3; i <= 20 ; i++){
            num +=fo;
            fo = (double) (i-1+i) / (i-2+i-1);
        }
        System.out.println(num);
    }
}
