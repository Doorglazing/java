package Exception;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int index = 4;
        try{
            getElenment(arr,4);
        }catch (Exception e){
            System.out.println(e.getStackTrace()+e.getMessage());
        }
    }
    public static int getElenment(int[] arr, int index){
        if(index < 0 || index >= arr.length){
            throw new ArrayIndexOutOfBoundsException("下标越界");
        }
        return arr[index];
    }
}
