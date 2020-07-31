package FanXing.myGeneric;

public class MyGenericClass<MVP> {
    // 没有MVP类型，在这里代表未知的一种数据类型
    // 未来传递什么就是什么类型
    private MVP mvp;
    // 如果没有MVP泛型则报错

    public MVP getMvp() {
        return mvp;
    }

    public void setMvp(MVP mvp) {
        this.mvp = mvp;
    }
}
