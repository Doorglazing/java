package Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Random;

public class Demo3 {
    public static void main(String[] args) {
        Person[] array = {
             new Person("貂蝉", 233),
             new Person("孙尚香", 234),
             new Person("岑一", 22),
             new Person("无敌", 44)
        };
//        Comparator<Person> comparator = new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return (int)Math.round(Math.random()*100 - 50);
//                //返回值小于0 降序排列：说明按照从大到小排序
//                //升序排列  说明按照从小到大排序
//            }
//        };
        Arrays.sort(array, (Person a, Person b)->{
            return a.getAge() - b.getAge();
        });
        for(Person p : array){
            System.out.println(p.getName()+p.getAge());
        }
        // 排序
        // new Comparator()
        HashMap<String, Integer> map =  new HashMap<>();
        map.put("213",1);

        System.out.println(map.get("213"));
    }
}
