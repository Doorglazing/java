public class ten {
    public static void main(String[] args) {
        int[][] a = new int[6][6];

        for (int i = 0; i < 6; i++) {
            a[i][0] = 1;
        }
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i + 1; j++) {
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print(a[i][j]);
                System.out.print("\t");
            }

            System.out.println();
        }
    }
}
