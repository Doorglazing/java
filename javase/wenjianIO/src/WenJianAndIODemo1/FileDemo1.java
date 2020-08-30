package WenJianAndIODemo1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        // File实例的构建方式
        File file = new File("E:/javaProject/java/javase/wenjianIO/IO/temp.txt");
        File Io = new File("E:\\javaProject\\java\\javase\\wenjianIO\\IO");
        String absolute = file.getAbsolutePath();
        // 返回绝对路径
        System.out.println(absolute);
        System.out.println(file.getName());
        System.out.println(file.getPath());
        File[] files = Io.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println(file.length());
    }
}
