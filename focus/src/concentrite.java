import java.util.ArrayList;
import java.util.Scanner;

public class concentrite {
    //集合分为两个部分
    /*  接口层
    *   1. Collection： 一组独立对象
    *       有两个子接口 ： List： 其中元素有序，可重复
    *                     Set： 其中元素无序，不可重复
    *   2. Map：一组成对的“键值对”对象
    *   3. Iterator： 用于遍历集合
    *   实现层
    *   1.ArrayList: 一种List集合
    *          可以理解为一种动态数组
    *          每个元素都有索引号
    *          元素个数可变
    *          元素只能是对象
    *          可以通过泛型明确每个元素的类型
    *          可以重复
    *
    *       方法：
    *           add(index,object)
    *          不指定索引在集合的末尾添加
    *           addAll(index,Collection c)
    *           可以将已经存在的集合添加到末尾
    *           remove(index)
    *           删除指定位置上的元素
    *           get(int index)
    *           获取某个元素
    *           subList(起始索引,终止索引)
    *           截取从起始索引到终止索引得到一个子集合
    *           indexOf(object)
    *           查找某个元素
    *           lastIndexOf(obj)
    *           从后往前查
    *           Object set(index,obj)
    *           修改指定位置的元素
    *           listlterator()
    *           listlterator(index)
    *           转换成迭代器元素
    *     2.HashSet: 一种Set集合
    *       元素个数可以动态变化；
    *       元素类型可通过泛型明确
    *       元素不能重复
    *       需要转换成其他集合进行遍历,比如lterator
    *
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> score = new ArrayList<Integer>();
        while(true){
            System.out.println("请打分");
            int a = sc.nextInt();
            if(a == 0){
                break;
            }
            score.add(a);
        }
        for(int i = 0; i < score.size(); i++){
            System.out.println(score.get(i));
        }
        System.out.println(score);
    }
}
