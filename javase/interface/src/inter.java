public interface  inter {
    //接口
    //只能设置常量
    // static final 类型 名 = 值
    // 在接口中定义的方法一定是抽象方法
    // 没有结构体
    // abstract 可以省略

    // 类通过implements关键字来实现接口
    // 类必须实现（覆盖）接口中描述的所有方法
    static final double PI = 3.14;
    public double area();
    public double bulk();
}

