public class demo1 {
    public static void main(String[] args) {
        int a = 123;
        if(a % 2 == 0){
            System.out.println("偶数" + a);
            return;
        }
        System.out.println("奇数:" + a);
        Sample3 b  = new Sample3();
        b.level(90);
    }
}