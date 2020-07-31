package FanXing.myGeneric;

import java.util.ArrayList;
import java.util.Collection;

public class GenericDemoTest4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Number> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList<>();
        getElement1(list);
//        getElement1(list2);  //报错
        getElement1(list3);
//         getElement1(list4); // 报错
//        getElement2(Integer); //报错
//        getElement2(list2); // 报错
        getElement2(list3);
        getElement2(list4);
    }
    public static void getElement1(Collection<? extends Number> list){
        //代表接收Number及其子类 上限
    }
    public static void getElement2(Collection<? super Integer> list){
        //代表接收Integer及其父类 下限
    }
}
