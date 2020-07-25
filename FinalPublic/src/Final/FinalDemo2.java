package Final;

public class FinalDemo2 {
    public static void main(String[] args) {
//        User u = new User();
//        User u2 = new User();
//        System.out.println(u);
//        System.out.println(u2 == u); // false
        final User u3 = new User();
        final User u4 = new User();
        u3.userName = "zhangsan";
//        System.out.println(u3); // false
    }
}
