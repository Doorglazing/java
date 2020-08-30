package WenJianAndIODemo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IODemo1 {
    public static void main(String[] args) throws IOException {
        //字节流 输入流
        FileInputStream stream = new FileInputStream("E:\\javaProject\\java\\javase\\wenjianIO\\IO\\temp.txt");
//        // 读一个字节
//        int read = stream.read();
//        System.out.println((char) read);
//        // 输出一串 此时中文是乱码 汉字是两个字节 所以读汉字要用字符流
//        while (read!=-1){
//            System.out.print((char) read);
//            read = stream.read();
//        }
        // 一次性读多个字节
        // read(byte []); 中文还是乱码因为处理时还是读取一个字节
//        byte[] by = new byte[10];
//        int read1 = stream.read(by);
//        while (read1 != -1){
//            for(int i = 0; i < by.length; i++){
//                System.out.print((char)by[i]);
//            }
//            read1 = stream.read(by);
//        }

        // 一次性读取所有内容
        // stream.available() 文件有多少长度
        byte[] by = new byte[stream.available()];
        int read = stream.read(by);
        if(read!=-1){
            for (int i = 0; i < by.length; i++){
                System.out.print((char) by[i]);
            }
        }
        // 关闭流
        stream.close();
    }
}
