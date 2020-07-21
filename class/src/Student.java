public class Student extends Teacher {
    Student(){

    }
    Student(String name,int age, String content){
        this.name = name;
        this.age = age;
        this.content = content;
    }

    @Override
    void eat() {
        System.out.println("年龄为"+age+name.charAt(0)+"同学"+"正在吃饭");
    }
    void study(){
        System.out.println("年龄为"+age+name.charAt(0)+"同学"+"正在专心致志听着"+content);
    }
}
