import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list =  new ArrayList<String>();
        //<泛型> 可以理解为对存入数据的限制
        //<String> 只能存入String型
        String a = "333";
        list.add("鲁班七号");
        list.add("废物");
        list.add("死宅");
        list.add(a);
        System.out.println(list);
        //ArrayList 可以直接打印
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //获取索引位置的值
        System.out.println(list.remove(1));
        //删除某元素
        System.out.println(list);
        System.out.println(list.contains("废物"));
        list.set(1,"废物");
        //修改索引位置的值
        System.out.println(list);
        System.out.println(list.contains("废物"));
        //查看list集合中是否有此元素

        System.out.println(list.listIterator(1));

        list.clear();
        //清空list中所有元素
        System.out.println(list);
    }
}
