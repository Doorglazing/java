package homework1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public class Car {
    private String name;
    private String color;
    public Car(){}
    public Car(String name, String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }

    public static void main(String[] args) {
        HashMap<Object, Integer> map = new HashMap<>();
        map.put(new Car("宝马","蓝色"), 200000);
        map.put(new Car("奥迪","黑色"), 900000);
        map.put(new Car("布加迪","蓝色"), 20000000);
        Set<Object> set = map.keySet();
        for(Object key : set){
            System.out.println(key + "=" +map.get(key));
        }
        Set<Entry<Object, Integer>> set1 = map.entrySet();
        for(Entry entry : set1){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
