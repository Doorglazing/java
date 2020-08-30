package WenJianAndIODemo1;

import java.io.*;

public class FileReaderDemo1 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("E:\\javaProject\\java\\javase\\wenjianIO\\IO\\temp.txt");
        FileWriter writer = new FileWriter("E:\\javaProject\\java\\javase\\wenjianIO\\IO\\temp1.txt");
        BufferedReader reader1 = new BufferedReader(reader);
        BufferedWriter writer1 = new BufferedWriter(writer);
//        char[] chars = new char[1024];
//        int len = reader1.read(chars);
        String str = reader1.readLine();
        while (str != null){
            writer1.write(str);
            writer1.write("\n");
            str = reader1.readLine();
        }
        writer1.flush();
        reader.close();
        writer.close();
    }
}
