public class doubleSearch {
        public static void main(String[] args) {
            int[] a = {1,2,3,4,5,6,7,8,9};
            int high =  a.length - 1;
            int low = 0;
            int w = 8;
            int mid = (high + low) / 2;
            //记录查找位置
            int loca = -1;
            while(high >= low){
                if(w == a[mid]){
                    loca = mid;
                    break;
                }else if(w > a[mid]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
                mid = (low + high) / 2;
            }
            if(loca == -1){
                System.out.println("不存在");
            }
            if(loca != -1){
                System.out.println(loca);
            }
        }
}


