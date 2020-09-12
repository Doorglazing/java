package args;

public class ArgsTest {
    public static void main(String[] args) {
        // 要求个数是0~10
        // 只能有一个可变长， 而是是参数中最好一个
        // 可以将可变长参数当作一个数组
        m();
        m("21");
        m("a","s","sda","sdafsa");
    }
    public static void m(String... args){
        System.out.println(args.length);
        for(int i = 0 ; i < args.length; i++){
            System.out.println(args[i]);
        }
        System.out.println("方法执行了");
    }
}

