package homework4;

public class Test {
    public static void main(String[] args) {
        Star star = new Star();
        star.shine("star", "星星一闪一闪亮晶晶");
        Universe sun = new Sun();
        sun.doAnything();
        Sun sun1 = (Sun)sun;
        sun1.shine("sun", "光照八分钟,到达地球");
    }
}
