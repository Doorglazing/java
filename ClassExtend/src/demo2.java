import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10 ; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        ArrayList<String> list1 = new ArrayList<>();
    }
}
