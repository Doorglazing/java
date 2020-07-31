package Exception;

import java.io.FileNotFoundException;

public class TryCatch {
    public static void main(String[] args){
        try{
            read("小秘1.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            //打印出的时红字
            System.out.println(e);
        }finally {
            //不管try和catch发生了啥，他都执行
            System.out.println("陈毅是接盘侠");
        }
    }
    public static void read(String path) throws FileNotFoundException{
        if(!path.equals("小秘密.txt")){
            throw new FileNotFoundException("文件名不正确");
        }
    }
}
