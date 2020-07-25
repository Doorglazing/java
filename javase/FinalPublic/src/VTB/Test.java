package VTB;

public class Test {
    public static void main(String[] args) {
        /**
         * 等号左边： 是多态赋值， 接口类型引用指向子类对象
         * 等号右边： 是匿名内部类，定义并创建了该接口的子类对象
         *
         */
        Vtuber f = new Vtuber(){
            public void hide(){
                System.out.println("fff");
            }
        }; // 相当于做了子类实现
        Vtuber f1 = new Vtuber(){
            public void hide(){
                System.out.println("fff");
            }
        };
        System.out.println(f);  // VTB.Test$1@地址
        System.out.println(f1); // VTB.Test$2@地址
        Son son = new Son();
        son.new Vtu().song();
        fp(f);
        fp(new Vtuber() {
            @Override
            void hide() {
                System.out.println("111");
            }
        });

    }
    public static void fp(Vtuber vtuber){
        System.out.println(vtuber);
    }
}
