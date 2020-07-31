package FanXing.myGeneric;

public class MyGenericMethod {
    public <MVP> void show(MVP mvp){
        System.out.println(mvp.getClass());
        // getClass() Class +  java.lang.类型 String Integer Double
    }
    public <MVP> MVP show2(MVP mvp){
        return mvp;
    }

    public static void main(String[] args) {
        MyGenericMethod myGenericMethod = new MyGenericMethod();
        myGenericMethod.show("aaaa");
        myGenericMethod.show("123");
        myGenericMethod.show(12.45);
        myGenericMethod.show(55);
    }
}
