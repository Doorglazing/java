package WenJianAndIODemo1;

import java.io.*;

public class ObjectStreamIODemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write();
        read();
    }
    private static void read() throws IOException, ClassNotFoundException {
        // 创建反序列化对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                "E:\\javaProject\\java\\javase\\wenjianIO\\IO\\temp.txt"));

        // 还原对象
        Object obj = ois.readObject();

        // 释放资源
        ois.close();

        // 输出对象
        System.out.println(obj);
    }

    private static void write() throws IOException {
        // 创建序列化流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                "E:\\javaProject\\java\\javase\\wenjianIO\\IO\\temp.txt"));

        // 创建对象
         Person  p = new Person("林青霞", 27);

        // public final void writeObject(Object obj)
        oos.writeObject(  p);

        // 释放资源
        oos.close();
    }
}

