package reflect_FBY;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Reflect_Test {
    public static void main(String[] args) throws ClassNotFoundException {
        StringBuilder stringBuilder = new StringBuilder();
        Class aClass = Class.forName("reflect_FBY.User");
        stringBuilder.append(Modifier.toString(aClass.getModifiers())  + " Class " + aClass.getSimpleName() +"{"+"\n");
        Field[] fields = aClass.getDeclaredFields();
        for(Field field : fields){
            stringBuilder.append("\t");
            stringBuilder.append(Modifier.toString(field.getModifiers()));
            stringBuilder.append(" ");
            stringBuilder.append(field.getType().getSimpleName());
            stringBuilder.append(" ");
            stringBuilder.append(field.getName());
            stringBuilder.append(";");
            stringBuilder.append("\n");
        }
        stringBuilder.append("}");
        System.out.println(stringBuilder);
    }
}
