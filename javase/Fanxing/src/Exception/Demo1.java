package Exception;

public class Demo1 {
    public static void main(String[] args) {
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[4]);
        }catch (Exception e){
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }
        if(1==1){
//            throw new NullPointerException("要访问的arr数组不存在");
            throw new ArrayIndexOutOfBoundsException("数组越界");
        }

    }
}
