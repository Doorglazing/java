package HashMap;

import java.util.HashMap;

public class TestStuden {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
//        Student student = new Student("刘能", 34);
//        map.put(student, "锦州"); //同一地址
//        map.put(student, "葫芦岛");
        map.put(new Student("刘能", 34), "锦州");
        map.put(new Student("刘能", 34), "葫芦岛");  //不同地址s
        for(Student key : map.keySet()){
            System.out.println(key);
            System.out.println(map.get(key));
        }
        System.out.println(map);
    }
}
