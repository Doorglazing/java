package WenJianAndIODemo1;

import java.io.*;

public class FileOutPutStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("E:\\javaProject\\java\\javase\\wenjianIO\\IO\\temp.txt");
        // 写的时候每次清空原来的内容
        FileInputStream file1 = new FileInputStream("E:\\javaProject\\java\\javase\\wenjianIO\\IO\\temp1.txt");
        byte[] bytes = new byte[file1.available()];
        file1.read(bytes);
        file.write(bytes);
        file.close();
    }
}
