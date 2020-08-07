public class Four {
    /**
     * 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
     * 程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
     * (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
     * (2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数n,重复执行第一步。
     * (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
     * (4)质因数只针对合数 即不是质数并且大于1 的数
     *
     */
    public static void main(String[] args) {
        mathFour(200);
    }
    public static void mathFour(int n){
        if(n < 2){
            System.out.print("无质因数");
            return;
        }
        System.out.print(n + "=");
        for (int i = 2; i <= n; i++) {
            if(i == n){
                System.out.print(i);
                return;
            }
            if(n % i == 0 && i != n){
                System.out.print(i + "*");
                n /= i;
                i = 1;
                continue;
                // 因为 for循环最后会 i++ 所以先给i赋值为1  然后 i 依旧会变成2
            }
        }
    }
}
