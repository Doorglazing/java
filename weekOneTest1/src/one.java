public class one {
    public static void main(String[] args) {
        int add = 0;//记录因子大小
        for(int i = 2; i < 1000; i++){
            for(int j = 1;j < i; j++){
                if(i%j == 0){
                    add += j;
                }
            }
            if(add == i){
                System.out.println(i);
            }
            add = 0;
        }
    }
}
