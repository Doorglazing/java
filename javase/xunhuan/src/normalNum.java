public class normalNum {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            int num = 0;
            for(int j = 1; j <= i; j ++){
                if(i % j == 0) {
                    num++;
                }
            }
            if(num == 2){
                System.out.println(i);
            }else if(num < 2){
                System.out.println(i + "不在质数范围内");
            }
        }
    }
}
