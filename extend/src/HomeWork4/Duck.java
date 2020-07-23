package HomeWork4;

public class Duck extends Poultry {
    Duck () {}

    Duck(String name, String symotom, String illness, int age) {
        super(name, symotom, illness, age);
    }

    @Override
    void showSymptom() {
        super.showMsg();
    }
}
