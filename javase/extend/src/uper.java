public class uper {
    public static void main(String[] args) {
        /*
        *   super
        *   在子类中调用父类的属性和方法
        *   *不能在静态方法中用
        *   在子类的构造方法中指明调用父类的构造方法
        *   *如果调用父类的构造方法，super语句必须写在子类构造方法的第一条
        * */
    down d = new down();
        d.vo("是多么寂寞");
}
}
class up {
    up(int age){
        System.out.println(age);
    }
    static String free(String s){
        return s;
    }
}
class down extends up {
    String str;
    down (){
        super(1);
    }


    void vo(String s){
        this.str = up.free("无敌");
        System.out.println(str + s);
    }
//    private
//    public
//    protected





}
