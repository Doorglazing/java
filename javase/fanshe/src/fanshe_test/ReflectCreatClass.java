package fanshe_test;

public class ReflectCreatClass {
    public static void main(String[] args) {
        try {
            Class aClass = Class.forName("fanshe_test.User");
            // 通过反射创建对象
            // 通过newInstance()调用无参构造,必须保证无参
            // 构造是存在的！

            Object o = aClass.newInstance();

            System.out.println(o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
