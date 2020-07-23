public class StringToCharArray {
    public static void main(String[] args) {
        String s = "helloworld";
        //转化为字符数组
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        //转化为字节类型的数组
        //输出asc码对应的数
        byte[] bytes  =s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        //不改变原来的字符串 因为字符串原空间不可变
        System.out.println(s.replace("h","c"));
        System.out.println(s);

        String s1 = "123124@.com";
        String s2 = "1/2/3";
        String[] str1 = s1.split("@");
        //返回一个数组 [123124,.com]
        String[] str2 = s1.split("/");
        //[1,2,3]
    }
}
