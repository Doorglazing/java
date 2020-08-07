public class Three {
    /**
     *  水仙花数
     *  100 ~ 999
     *  数 = 个位立方 + 十位立方 + 百位立方
     *  @param args
     */
    public static void main(String[] args) {
        mathThree();
    }
    public static void mathThree(){
        int one, two , three;
        for (int i = 100; i < 1000; i++) {
            one = i % 10;
            two = i / 10 % 10;
            three = i / 100;
            if(i == one*one*one + two*two*two + three*three*three){
                System.out.println(i);
            }
        }
    }
}
