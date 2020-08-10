package MathStack.PaiXu;

import java.util.Arrays;

public class Bucketsort {
    // 桶排序 &  箱排序

    // 桶数组
    private int[] bucket;
    // 要进行排序的数组
    private int[] array;
    // 初始化成员变量
    public Bucketsort (int bucket, int[] array){
        this.bucket = new int[bucket];
        this.array = array;
    }
    // 将数组中和桶的索引相同的数字 装入桶中 并且将桶索引的值+1
    public Bucketsort sort(){
        for (int i = 0; i < array.length; i++) {
            bucket[array[i]]++;
        }
        return this;
    }
    // 输出桶中索引值大于0的所有排好的数字
    public Bucketsort sortPrt(){
        int index = 0;
        for (int i = 0; i < bucket.length; i++) {
            for(int j = 0; j < bucket[i]; j++){
               array[index++] = i;
            }
        }
        System.out.println(Arrays.toString(array));
        return this;
    }

    public static void main(String[] args) {
        int[] array = {1,10,8,9,5,2};

        new Bucketsort(11, array).sort().sortPrt();
    }
}
