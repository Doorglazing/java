package InstanceOf;

public class Test {
    public static void main(String[] args) {
        Fu fu = new Fu();
        Zi zi = new Zi();
        Fu zi1 = new Zi();
        if(fu instanceof Zi){
            System.out.println("ziZi");
        }else if(zi instanceof Fu){
            System.out.println("ziFu");
        }else if(fu instanceof Zi){
            System.out.println("fuZi");
        }
    }
}
