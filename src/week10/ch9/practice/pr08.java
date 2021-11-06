package week10.ch9.practice;

import javax.swing.*;
import java.awt.*;

class NorthPanel extends JPanel {
    NorthPanel() {
        setBackground(Color.gray);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(new JButton("열기"));
        add(new JButton("닫기"));
        add(new JButton("나가기"));
    }
}

class CenterPanel extends JPanel {
    CenterPanel() {
        setLayout(null);
        for(int i=0; i<10; i++) {
            JLabel j = new JLabel("*");
            j.setSize(10, 10);
            int x = (int)(Math.random()*200)+10;
            int y = (int)(Math.random()*200)+10;
            j.setLocation(x, y);
            add(j);
        }
    }
}

class SouthPanel extends JPanel {
    SouthPanel() {
        setBackground(Color.YELLOW);
        add(new JButton("Word Input"));
        JTextField jt = new JTextField();
        jt.setColumns(18);
        add(jt);
    }
}

public class pr08 extends JFrame {
    pr08() {
        setTitle("여러 개의 패널을 가진 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       Container c = getContentPane();
        c.setLayout(new BorderLayout(0, 0));
        c.add(new NorthPanel(), BorderLayout.NORTH);
        c.add(new CenterPanel(), BorderLayout.CENTER);
        c.add(new SouthPanel(), BorderLayout.SOUTH);

        setSize(300, 400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new pr08();
    }
}
