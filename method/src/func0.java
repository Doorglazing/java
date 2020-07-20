public class func0 {
    public static void main(String[] args) {
        /*
        *   在面向对象编程中，管函数叫方法
        *   修饰符  static 返回值类型 void 方法名 【小驼峰】（参数列表）{
        *       方法代码
        *       return；
        *   }
        * */
        //  求两个数的最大值的方法
        System.out.println(max(5,6));
        System.out.println(add(100));

    }
    public static int max (int i, int j){
       if(i > j){
           return i;
       }
       return j;
    }
    //求 1 ~ num累加
    public static int add (int i){
            if(i < 2){
                return 1;
            }
        return i + add(--i);
            //return i +  i - 1 + i - 2 + i -3 ~ + 1;
    }
    //return 的作用 ： 1，返回函数对应的类型
    //                2. 结束这个方法
}


