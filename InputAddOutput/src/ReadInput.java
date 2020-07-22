import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadInput {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("1.txt");
        FileWriter fw = new FileWriter("2.txt");
        int c = 0;
        while ((c = fr.read())!= -1){
            fw.write(c);
        }
        fr.close();
        fw.close();
        System.out.println("完成");
    }
}
