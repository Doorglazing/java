package resouceBundleTest;

import java.util.ResourceBundle;

public class ResouceBundle1 {
    public static void main(String[] args) {
        // 资源绑定器 只能帮顶xxx.properties文件
        ResourceBundle bundle = ResourceBundle.getBundle("classinfo.properties");
    }
}
