public class StringEquals {
    public static void main(String[] args) {
        String a = new String ("abcd");
        String b = new String("abcd");
        // abcd 放在常量池中
        String c = "abcd";
        String d = "abcd";
        if(a == b){
            //不是同一个对象 比较地址
            System.out.println("a==b");
        }
        if(a.equals(b)){
            //ture
            System.out.println("c==d");
        }
        if(c == d){
            //true 共享同一变量
            System.out.println("c==d");
        }

    }
}
