package reflect_field;

import java.lang.reflect.Field;

public class FiledTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InstantiationException {
        Class aClass = Class.forName("reflect_field.User");
        // 只能获取public属性
        Field[] fields = aClass.getFields();
        Field[] declaredFields = aClass.getDeclaredFields();
        // 获取所有
        System.out.println(declaredFields.length);
        // 只能获取公开的
        System.out.println(fields[0]);
        System.out.println(fields.length);
        Object o = aClass.newInstance();
        Field id = aClass.getDeclaredField("neme");
        id.setAccessible(true);
        id.set(o, "sadas");
        System.out.println(id.get(o));
    }
}
