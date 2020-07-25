package ComputerDemo;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.run();
        // 向上转型
        USB mouse = new Mouse();
        //电脑使用usb
        USB keyBoard = new KeyBoard();
        computer.useUsb(mouse);
        computer.useUsb(keyBoard);
        computer.shutDown();
    }
}
