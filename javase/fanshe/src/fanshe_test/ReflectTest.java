package fanshe_test;

public class ReflectTest {
    public static void main(String[] args) {
        Class c1 = null;
        try {
             c1 = Class.forName("java.lang.String");// c1代表String.class
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String s = "abc";
        Class x = s.getClass();
        System.out.println(x == c1); // true
        //three java中任何一种类型都有.class属性
        Class z = String.class;
    }
}
