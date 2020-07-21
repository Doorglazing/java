public class Teacher {
    String name;
    int age;
    String content;
    Teacher(){

    }
    Teacher(String name,int age, String content){
        this.name = name;
        this.age = age;
        this.content = content;
    }
    void eat(){
        System.out.println("年龄为"+age+name.charAt(0)+"老师"+"正在吃饭");
    }
    void teach(){
        System.out.println("年龄为"+age+name.charAt(0)+"老师"+"正在亢奋的讲着"+content);
    }
}
