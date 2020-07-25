public class chongzai {
    public static void main(String[] args) {
        /**
         * 重载
         *  同名不同参（与修饰符和返回值类型无关）
         * Jvm、通过方法参数列表调用，调用不同的方法
         * ctrl D 复制一行
         * 例如： scanner.next();
         *
         *
         *
         */
        int a = 10, b = 10;
        printNum(a, b);
        doubling(a, b);
        printNum(a, b);
        a = doubling(a);
        b = doubling(b);
        printNum(a, b);
    }
    public static void printNum (int iVar, int iVar2){
        System.out.println("iVar: " + iVar + " " +"iVar2: " + iVar2);
    }
    public static void doubling (int r, int p){
        r *= 2;
        p *= 2;
        printNum(r,p);
    }
    public static int doubling (int r){
        return r*2;
    }

}
