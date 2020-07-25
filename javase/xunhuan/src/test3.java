import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        if(x / 1000 == 0){
            if(x / 100 == 0){
                if(x / 10 == 0){
                    System.out.println(x%10);
                }else{
                    System.out.println(x%10 + x/10%10);
                }
            }else{
                System.out.println(x%10 + x/10%10+ x/100 % 10);
            }
        }else{
            System.out.println(x%10 + x/10%10 + x/100 % 10 + x /1000);
        }

//        Character.tolowerCase();  转换为小写
//        Character.toUpperCase();  转换为大写
        String s = Integer.toString(x);
        System.out.println(s.length());
    }
}
