package MoreVary;

import java.util.ArrayList;
import java.util.List;

public class MoreVary {
    public static void main(String[] args) {
        Animal a = new Cat();
        Cat c = new Cat();
        Dog d = new Dog();
//        showCat(c);
//        showDog(d);
//        showAnimal(c);
//        showAnimal(d);
        Cat b = (Cat) a;
        b.eat();
        Dog e = (Dog) a;
        e.eat();//此处如果执行方法则报错 ClassCastException
        //为了避免转型发生异常，最好做个判断

        if(a instanceof Cat){
            Cat f = (Cat) a;
        }else{
            Dog g = (Dog) a;
        }
        //showAnimal == showCat 减少了代码冗余
    }
    public static void showDog(Dog dog){
        dog.show();
    }
    public static void showCat(Cat cat){
        cat.show();
    }
    public static void showAnimal(Animal animal){
        animal.show();
    }
}
