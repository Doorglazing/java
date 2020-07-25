package ComputerDemo;

public class Computer {
    // 包含运行
    public void run(){
        System.out.println("电脑运行起来了");
    }
    // 关机
    public void shutDown(){
        System.out.println("关机！");
    }

    // 使用USB
    // 当电脑对象调用这个方法时，必须给其传递一个组合符合USB规则的USB设备
    public void useUsb(USB usb){
        //判断是否有USB
        if(usb != null){
            usb.open();
            // 进行类型转换,调用特有方法
            if(usb instanceof Mouse){
                Mouse m = (Mouse)usb;
                m.click();
            }else if(usb instanceof KeyBoard){
                KeyBoard m = (KeyBoard)usb;
                m.type();
            }
            usb.close();
        }
    }
}
