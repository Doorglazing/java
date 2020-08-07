public class Two {
    public static void main(String[] args) {
        mathTwo(1);
        mathTwo(100);
        mathTwo(101, 200);
    }

    public static void mathTwo(int n){
        // 钥匙
        int key = 0;
        if(n <= 1){
            System.out.println("无素数");
            return;
        }
        System.out.print("素数为:");
        for (int i = 2; i <= n ; i++) {
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if(i % j == 0){
                    key = 1;
                    break;
                }
            }
            if(key == 0){
                System.out.print(i + " ");
            }
            key = 0;
        }
        System.out.println();
    }
    //重载
    public static void mathTwo(int n, int w){
        int key = 0;
        if(n <= 1){
            System.out.println("无素数");
            return;
        }
        System.out.print("素数为:");
        for (int i = n; i <= w ; i++) {
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if(i % j == 0){
                    key = 1;
                    break;
                }
            }
            if(key == 0){
                System.out.print(i + " ");
            }
            key = 0;
        }
        System.out.println();
    }
}
