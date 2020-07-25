import java.util.Scanner;

public class bitNum {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        String c = Integer.toString(b);
        for (int i = 0; i < c.length(); i++){
            System.out.println(c.charAt(i));
        }
        jisuan j = new jisuan();
        j.ji(25);
        j.sout();
    }
}
class jisuan {
    int num = 1;
    //递归
    int ji (int i){
            //判断i = 0时,阶乘为0；
            if(i == 0){
                num = 1;
                return 0;
            }
            num*=i;
            //出口
            if(i == 1){
                return 0;
            }
        return ji(--i);
    }
    void sout(){
        System.out.println(num);
        num = 0;
    }
}

