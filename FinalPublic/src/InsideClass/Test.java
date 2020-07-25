package InsideClass;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.new B().bTest(); // 外部类调用内部类成员方法
        A.B b = a.new B();
        A.B b1 = new A().new B();
        b1.bTest();
    }
}
