public class TestCoderMana {
    public static void main(String[] args) {
        Manager manager = new Manager("james", "9527", new int[]{15000, 3000});
        manager.intro();
        manager.showSalary();
        manager.work();
        System.out.println("========");
        Coder coder = new Coder("kobe","0025" ,10000);
        coder.intro();
        coder.showSalary();
        coder.work();
    }
}
