import java.util.ArrayList;
import java.util.Arrays;

public class testArraylist1 {
    public static void main(String[] args) {
        ArrayList1[] arrayList1s = new ArrayList1[3];

        ArrayList1 a1 = new ArrayList1("张三", 123);
        ArrayList1 a2 = new ArrayList1("张si", 123);
        ArrayList1 a3 = new ArrayList1("张wu", 123);
        //对象存入数组
        arrayList1s[0] = a1;
        arrayList1s[1] = a2;
        arrayList1s[2] = a3;
        for (int i = 0; i < arrayList1s.length; i++) {
            ArrayList1 a = arrayList1s[i];
            System.out.println(a.getName()+"-->"+a.getAge());
        }
        //存储对象目前只能使用数组
        //数组的长度是固定的，无动态扩容
        //ArrayList类是集合

        ArrayList<ArrayList1> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        System.out.println(list);
    }
}
