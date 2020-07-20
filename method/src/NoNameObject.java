import java.util.Scanner;

public class NoNameObject {
    public static void main(String[] args) {
        /**
         * 匿名对象
         *
         *
         */
//        int i = new Scanner(System.in).nextInt();
        // 匿名对象作为方法的参数和返回值
        input(new Scanner(System.in));
    }
    public static void input(Scanner sc){
        System.out.println(sc);
    }
    public  static Scanner getScanner(){
        // 普通方式
//        Scanner scanner = new Scanner(System.in);
//        return scanner;
        return new Scanner(System.in);
    }
}
