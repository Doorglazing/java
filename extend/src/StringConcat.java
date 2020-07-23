public class StringConcat {
    public static void main(String[] args) {
        String s = "helloworld";
        System.out.println(s.length());
        //10
        System.out.println(s.concat("##aa"));
        //helloworld##aa
        System.out.println(s.charAt(0));
        // h
        System.out.println(s.indexOf("l"));
        //返回第一次找到的索引 没找到返回-1
        System.out.println(s.substring(5));
        //从start 开始截取包括start 截到最后
        System.out.println(s.substring(0,5));
        //左闭右开 [start, end);
    }
}
