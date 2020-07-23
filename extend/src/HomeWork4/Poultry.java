package HomeWork4;

public abstract class Poultry {
    private  String name,
                    symotom,
                    illness;
    private  int age;
    Poultry(){}

    public Poultry(String name, String symotom, String illness, int age) {
        this.name = name;
        this.symotom = symotom;
        this.illness = illness;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymotom() {
        return symotom;
    }

    public void setSymotom(String symotom) {
        this.symotom = symotom;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    abstract void showSymptom();
    void showMsg(){
        System.out.println("动物种类:"+ getName()+","+ "年龄"+getAge()+"岁");
        System.out.println("入院原因："+ getSymotom());
        System.out.println("症状：" + getIllness());
    }

}
