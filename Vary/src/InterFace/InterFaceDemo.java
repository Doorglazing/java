package InterFace;

public interface InterFaceDemo {
    //public void method();  // 接口中普通方法都是抽象方法
    // jdk9 含有私有方法
    public void eat1();
    public default void eat(){
        System.out.println("1");
    }
    public static void method2(){
        System.out.println("2");
    }

}
