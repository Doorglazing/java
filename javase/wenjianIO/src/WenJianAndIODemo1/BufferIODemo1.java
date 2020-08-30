package WenJianAndIODemo1;

import java.io.*;

public class BufferIODemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream file=new FileInputStream("E:\\javaProject\\java\\javase\\wenjianIO\\IO\\temp.txt");
        FileOutputStream file1 = new FileOutputStream("E:\\javaProject\\java\\javase\\wenjianIO\\IO\\temp1.txt");
        BufferedInputStream bis = new BufferedInputStream(file);
        BufferedOutputStream bis1 = new BufferedOutputStream(file1);
        byte[] b = new byte[bis.available()];
        int read = bis.read(b);
        bis1.write(b);
        // 清除缓存区 写入
        bis1.flush();

        file.close();
        file1.close();
    }
}
