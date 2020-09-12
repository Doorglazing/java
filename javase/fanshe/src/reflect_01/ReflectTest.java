package reflect_01;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        // 获取绝对路径
       String path =  Thread.currentThread().getContextClassLoader().getResource("classinfo.properties").getPath();
        FileReader reader = new FileReader(path);
        Properties properties = new Properties();
        properties.load(reader);
        reader.close();
        String name = properties.getProperty("name");
//        System.out.println(name);
        Class aClass = Class.forName(name);
        Object o = aClass.newInstance();
        System.out.println(o);
    }
}
