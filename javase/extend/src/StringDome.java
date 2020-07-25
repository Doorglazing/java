public class StringDome {
    public static void main(String[] args) {
        String str = "haha";
//        String str1 = "haha";
        //由于不可变,内存中只有一个"haha"，对象被创建同时被str和str1共享
        str = "d";
        System.out.println(str);
    }
}
