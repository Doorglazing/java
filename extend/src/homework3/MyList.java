package homework3;

import java.util.ArrayList;

public class MyList {
    String list = "[";
    int index = 1;
    String str ;
    //索引
    String add(String n){
        if(index > 1){
            list+=",";
            list+=n;
            index+=2;
        }else{
            list+=n;
            index+=1;
        }
        return list;
    }
    String add(int n){
        if(index > 1){
            list+=",";
            list+=n;
            index+=2;
        }else{
            list += n;
            index+=1;
        }
        return list;
    }
    String add(boolean n){
        if(index > 1){
            list+=",";
            list+=n;
            index+=2;
        }else{
            list+=n;
            index+=1;
        }
        return list;
    }
    String remove(int n){
        if((n+1)*2 > list.length()){
            System.out.println("下标越界,remove失败");
            return "0";
        }
        int num = 0;
        if(n == 0){
           System.out.println(list.charAt(1));
           str = list.substring(0,1);
            if(n + 1 <= list.length() - 1){
                str += list.substring(n + 3);
            }
           return str;
        }
        for (int i = 0; i < list.length();i++){
            if(list.charAt(i) == ','){
                num++;
            }
            if(num == n){
                System.out.println(list.charAt(i+1));
               str = list.substring(0, i);
               if(i + 1 <= list.length() - 1){
                    str += list.substring(i + 2);
               }
               break;
            }
        }

        return str;
    }
    void show(){
            if(str != null){
                System.out.println(str + "]");
            }else {
                System.out.println(list + "]");
            }
    }

}
