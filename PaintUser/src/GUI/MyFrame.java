package GUI;

import javax.swing.*;
import java.awt.*;

/**
 *  GUI设计工作分两个阶段：
 *      1.设计并创建界面外观（画界面）
 *      2.实现界面的交互功能（事件处理）
 *  图形界面：
 *      1.由GUI组件(Components)组成
 *          控制组件(control Components):组成界面的最小单位
 *          容器组件(Container Components):用于组织其他组件的单元
 *  JFrame (框架)
 *      框架(JFrame)是一个不被其它窗体所包含的独立的窗体，是编写图形化应用程序
 *      的最外层容器
 *      以"J"开头的组件类称为Swing组件
 */
public class MyFrame extends JFrame {
    public static void main (String[] args){
        MyFrame frame = new MyFrame(); // 创建窗体对象
        frame.setVisible(true); // 显示窗体


    }
    JTextField jtfNum1 = new JTextField(10);
    JTextField jtfNum2 = new JTextField(10);
    JTextField jtfResult = new JTextField(10);
    //创建文本框对象 宽度为10个位置
    JLabel jtfAdd = new JLabel("+");
    //创建标签
    JButton jbtBtn = new JButton("=");
    //创建按钮
    public MyFrame(){ // 构造方法，初始化窗体
        this.setSize(700, 500);//设置窗体的初始大小
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗体后同时关闭应用
        this.setLocationRelativeTo(null); //设置窗体相对位置，默认居中
        this.setTitle("first iFrames");//设定标题

        Container cp = this.getContentPane(); //得到窗体窗格】、
        cp.setLayout(new FlowLayout());// 布局管理器
        //Flowlayout有左到右将组件排在容器中，一排排满后在排新的一行
        //并且始终左右居中
        //如果没有这一句 则下面add加入的第一个占据全部
        cp.add(jtfNum1);
        cp.add(jtfAdd);
        cp.add(jtfNum2);
        cp.add(jbtBtn);
        cp.add(jtfResult);//将上面的东西依次添加
        jtfResult.setEditable(false);//文本框变为不可编辑
    }

}
