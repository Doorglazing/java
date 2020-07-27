package Object;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ToStringmain {
    private String name;
    private int age;
    ToStringmain(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        System.out.println(new ToStringmain("张三", 13).toString());
        int i[] = {1,2,3};
        Arrays.toString(i);
    }

    public String toString(){
        return "ToStringmain{" + "name=" + name + "age=" +age +"}";
    }
}
