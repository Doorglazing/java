public class four {
    public static void main(String[] args) {
        for(int i = 0; i < 100000; i++ ){
            if(Math.sqrt(i + 100) % 1 == 0 && Math.sqrt(i + 268) % 1 == 0){
                System.out.println(i);
            }
        }
    }
}
