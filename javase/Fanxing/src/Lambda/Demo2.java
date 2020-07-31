package Lambda;

public class Demo2 {
    public static void main(String[] args) {
        invoke(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("无敌是多么多么寂寞");
            }
        });
    }
    public static void invoke (Cook cook){
        cook.makeFood();
    }
}
