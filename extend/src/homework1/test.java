package homework1;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<SUV> suvs = new ArrayList<>();
        suvs.add(new SUV("奥迪",4813.0 , 760000.0));
        suvs.add(new SUV("宝马", 4545.0,188000.0 ));
        suvs.add(new SUV("福特", 3000.0, 199000.0));
        suvs.add(new SUV("宝马",4545.0, 188000.0));
        suvs.add(new SUV("宝马", 5599.0,188000.0 ));
        for (int i = 0; i < suvs.size(); i++) {
            suvs.get(i).judge();
        }
    }
}
