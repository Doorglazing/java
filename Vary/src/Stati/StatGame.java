package Stati;

import java.util.ArrayList;

public class StatGame {
    public static void main(String[] args) {
        System.out.println(StatGame.number);
        System.out.println(StatGame.list);
    }
    public static int number;
    public static ArrayList<String> list;
    //作用，给类变量进行初始化赋值
    static{
        number = 2;
        list = new ArrayList<String>();
        list.add("张三");
        list.add("李四");
    }
}
