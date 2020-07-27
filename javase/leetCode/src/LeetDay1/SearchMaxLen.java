package LeetDay1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

//
public class SearchMaxLen {
    public static void main(String[] args) {
        search("abcdefdef");
    }

    public static void search(String s) {
        //记录最大值
        int max = 0;
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
           if(list.indexOf(s.charAt(i)) != -1){
               //如果集合中存在此元素，并且长度大于Max，则改变Max
               if(max < list.size()){
                   max = list.size();
               }
               //替换list中的内容 截取    从重复的那一位+1 ，到最后  重新赋值给list
               //例如[1,2,3,4,5] 此时有3重复 list变为[4,5]
               list.retainAll(list.subList(list.indexOf(s.charAt(i)) + 1, list.size()));
           }
            list.add(s.charAt(i));
        }
        // 如果后面没有重复的数字 则存在进入if的情况
        // 所以在外部也应该做一次判断
        if(max < list.size()){
            max = list.size();
        }
        System.out.println(max);
    }
}
