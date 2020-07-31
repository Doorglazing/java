package Lambda;


public class Lambda {
    public static void main(String[] args) {
        // 格式: (参数类型 参数名称) -> {代码语句}
        invoke(()->{
            System.out.println("sout");
        });
    }
    public static void invoke (Cook cook){
        cook.makeFood();
    }
}