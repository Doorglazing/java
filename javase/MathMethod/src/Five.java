public class Five {
    /**
     * 题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
     * 程序分析：(a>b)?a:b这是条件运算符的基本例子。
     * main 函数的可以在run edit中的 programmer arguments中传入参数 此时我传入72
     * @param args
     */
    public static void main(String[] args) {
        int n = -1;
        try{
            n = Integer.parseInt(args[0]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("请输入成绩");
            return;
        }
        System.out.println(mathFive(n));
    }
    public static String mathFive(int n){
        return n > 90 ? "A" : (n > 60 ? "B" : "C");
    }
}
