package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class DoubleMath {
        public static void main(String[] args) {
            int[] arr = {2,7,11,15};
            System.out.println(Arrays.toString(twoSum2(arr, 9)));;
        }

        public static int[] twoSum(int[] nums, int target) {
            int len = nums.length;
            int[] arr = new int[2];
            for(int i = 0; i < len - 1; i++){
                if(nums[i] + nums[i+1] == target){
                    arr[0] = i;
                    arr[1] = i+1;
                    return arr;
                }
            }
            return arr;
        }
        //用map来进行查找可以大量节省运行时间
        public static int[] twoSum2(int[] nums, int target){
            HashMap<Integer, Integer> map = new HashMap<>();
            int len = nums.length;
            for (int i = 0; i < len; i++) {
                if(map.containsKey(target - nums[i])){
                    return new int[]{ map.get(target - nums[i]), i};
                }
                map.put(nums[i], i);
            }
            throw new ArrayIndexOutOfBoundsException("不对哦");
        }

}
