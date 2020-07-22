import java.util.ArrayList;
import java.util.Random;

public class demo3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100) + 1);
        }
        System.out.println("创建集合" + list);
        System.out.println(getArrayList(list));
        System.out.println(demo3());
    }

    public static ArrayList<Integer> getArrayList(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list1.add(list.get(i));
            }
        }
        return list1;
    }
    public static demo3 demo3(){
        return new demo3();
    }

}

