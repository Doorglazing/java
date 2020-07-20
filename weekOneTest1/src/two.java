public class two {
    public static void main(String[] args) {
        double add = 0; //记录球走过的路程
        double mi =  100;
        add += mi;
        for(int i = 0; i < 9; i++){
            add += mi;
            mi /= 2;
        }
        System.out.println("一共经过：" + add );
        System.out.println("第十次反弹：" + mi / 2);
    }
}
