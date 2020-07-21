public class Constructor {
    private int age ;
    private String name;
    Constructor (){
    }
    Constructor (int age){
        this.age = age;
    }
    Constructor (int age, String name){
        this.age = age;
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return "age：" + this.age + "name" + this.name;
    }
}
