package Lambda;

public class OneTest {
    public static void main(String[] args) {
        invoke(6, a -> a + 100);
        //输出a+100  即106
    }
    public static void invoke(int a, One one){
        System.out.println(one.prin(a));
    }
}
