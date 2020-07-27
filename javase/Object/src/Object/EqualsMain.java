package Object;

import java.util.Objects;

public class EqualsMain extends test {
    int age;
    String name;

    public EqualsMain(int age, String name) {
        this.age = age;
        this.name = name;

    }

    public boolean equals(Object o){
        //如果对象的地址值一样则

        if(this == o){
            return true;
        }
        //如果参数为null, 或者类型信息不一样, 则认为不同
        if(o == null && this.getClass() != o.getClass()){
            //getClass 打印"Class" + Object.EqualsMain
            return false;
        }
        //转化为当前类型
        //要求基本类型相等,并且将引用类型交给Objects类的equals的静态方法
        //比较类内其他基本类型
        EqualsMain equ = (EqualsMain)o;
        return this.age == equ.age && Objects.equals(this.name, equ.name);
    }

    public static void main(String[] args) {
       EqualsMain equ1 =  new EqualsMain(13, "张三" );
       System.out.println(equ1.equals(new EqualsMain(13, "张三" )));
        System.out.println(equ1.equals(new EqualsMain(13, "李四" )));
    }
}
