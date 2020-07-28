package StringBuffer;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(1) //返回this
                        .append(true)
                            .append("wtf");
        //可以添加任何类型
        //实现了链式调用
        stringBuilder.append(1)
                        .append(true)
                            .append("wtf");
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}
