import java.util.InputMismatchException;
import java.util.Scanner;

public class Catch {
    /**
     *  try{
     *      可能发生异常的语句
     *  }catch(处理异常的类型 对象名){
     *      发生异常时执行的语句
     *  }catch(){
     *
     *  }
     *  不产生异常情况
     *     -try语句结束后，不再
     *  在Java异常处理机制中规定，如果一个方法存在未处理的异常，则需要在该方法头上必须用
     *  throws关键字声明该异常
     *  public void debit (int i ) throws ....{
     *      throw new ...("");
     *  }
     *  这样通过异常声明可以将异常报告给方法的调用者
     *  由调用者来决定如何处理
     *  RuntimeException 及其子类的异常可以不声明.
     *  异常声明后必须要用try catch 处理, 否者报错
     *  主函数可以抛出异常s
     *
     * @param
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try{
            int a = scanner.nextInt(),
                b = scanner.nextInt();
            int result = a / b;
            System.out.println(result);
        }catch (ArithmeticException ex){
            System.out.println("除数不能为0");
        }catch (InputMismatchException ex){
            System.out.println("只能输入整数");
        }
        System.out.println("main end");
        try{
            ssr(1);
        }catch (ArithmeticException ex){
            System.out.println(ex);
        }
    }
    public static void ssr (int i) throws  ArithmeticException{
        throw new ArithmeticException();
    }
}
