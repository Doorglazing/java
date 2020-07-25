public class TestWhatIsClass {
    public static void main(String[] args) {
        WhatIsClass wtc = new WhatIsClass();
        System.out.println(wtc);
        //对象如果没有经过处理，打印出来的格式
        //包名，类名 @内存地址
        System.out.println(wtc.name); // null String
        System.out.println(wtc.age); // 0  int
        //给成员变量赋值
        wtc.name = "doorglazing";
        wtc.age = 22;
        System.out.println(wtc.name); // doorglazing
        System.out.println(wtc.age); // 22
        //调用方法
        wtc.eat();
        wtc.study();


        Phone phone = new Phone();
        System.out.println(phone.getAge());

        Constructor c = new Constructor(1);
        Constructor c1 = new Constructor(1,"huawei");
        System.out.println(c1);

    }
}
