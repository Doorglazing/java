public class chengF {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= i; j++){
                System.out.printf( i + "*"+ j + "=" + i*j);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
