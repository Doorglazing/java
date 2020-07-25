import java.util.Arrays;

public class nine {
    public static void main(String[] args) {
        int a = 12356321;
        boolean key = true;
        String b = Integer.toString(a);
        for(int i = 0; i < b.length()/2; i++){
            if(b.charAt(i) != b.charAt(b.length()-1-i)){
                System.out.println("不是回文数");
                key = false;
                break;
            }
        }
        if(key){
            System.out.println("是回文");
        }

    }
}
