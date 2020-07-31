package FanXing.myGeneric;

import java.util.ArrayList;

public class GenericDemoTest3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Object> objects = new ArrayList<>();
    }
    public static void getElement(ArrayList<?> coll){
        // <?> 代表可以接收任何类型
    }
}
