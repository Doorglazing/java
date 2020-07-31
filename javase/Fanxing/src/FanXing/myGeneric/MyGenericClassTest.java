package FanXing.myGeneric;

public class MyGenericClassTest {
    public static void main(String[] args) {
        // 创建一个泛型为String类
        MyGenericClass<String> objectMyGenericClass = new MyGenericClass<>();
        objectMyGenericClass.setMvp("哈登");
        String mvp = objectMyGenericClass.getMvp();
        System.out.println(mvp);
        MyGenericClass<Integer> myGenericClass = new MyGenericClass();
        myGenericClass.setMvp(13);
        Integer mvp1 = myGenericClass.getMvp();
        System.out.println(mvp1);
    }
}
