public class minZhi {
    public static void main(String[] args) {
        int i;
        boolean add;
        int num = 200;
        while(true){
            add = true;
            for(i=2; i < num; i++){
                if(num % i == 0){
                    add = false;
                    break;
                }
            }
            if(add){
                System.out.println(num);
                break;
            }
            num ++;
        }
    }
}
