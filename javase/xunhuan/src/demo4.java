public class demo4 {
    public static void main(String[] args) {
        //外循环控制行
        //内循环控制列
        for(int i = 0; i < 5; i++){
            for (int j = 0; j <= i; j++){
                //不换行输出
                System.out.print('*');
                continue;

            }
            //换行输出
            System.out.println();

        }
        //break 中断当前循环 只中断最近的循环 外层无影响
        //continue 结束本次循环进入下次循环

    }
}
