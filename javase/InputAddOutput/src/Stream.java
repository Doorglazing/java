import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream {
    /**
     * 按照方向分为：输入流和输出流
     * 按照信息处理基本单位分为字节流和字符流
     * InputStream/OutStream类是所有字节流类的父类
     * Reader/Writer是字符流的父类
     * 都是抽象类
     * <p>
     * FileInputStream文件输入字节流
     * FileInputStream文件输出字节流
     * FileReader文件输入字符流
     * FileWriter文件输出字符流
     */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("1.txt");
        FileOutputStream fos = new FileOutputStream("2.txt");
        int c = 0;
        try {
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }
        } catch (Exception e) {
            System.out.println(11);
        }
        fis.close();
        fos.close();
        System.out.println("完成");
    }
}
    /**
     * 流按照建立方式可以分为节点流和包装流
     * 节点流：能够独立建立，但处理方法少
     * 包装流：必须依靠其他流建立，处理方法多new DataInputStream(new FileInputStream("1.txt").readInt(1234)
     *                                                                             .readDouble(12.432)
     *                                      DataoutputStream
     *                                      .writeInt
     *                                 此时保存在文件中的是乱码
     */
    /**
     * 打印流
     *  用于文本输出的输出流
     *  PrintStream
     *  PrintWriter
     *  用与输出的方法时print()方法
     *
     *  new printStream(new FileOutputStream()).print(false)
     *  关闭打印流
     *
     *
     *
     */
/**
 * 缓冲流
 *  BufferedReader
 *  BufferedWriter
 *  BufferedInputStream
 *  BufferedOutputStream
 *
 */
