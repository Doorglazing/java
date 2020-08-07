package MathStack.DiGui;

public class Resever {
    public static void main(String[] args) {
        System.out.println(reseverStr("abcd"));
    }

    public static String reseverStr(String str){
        //当字符串中只剩1个时直接返回
        if(str.length() == 1){
            return str;
        }
        // abcd -->  dcba
        // 先把后三个截出来， 然后把第一个加到后面
        return reseverStr(str.substring(1)) + reseverStr(str.substring(0,1));
    }
}
