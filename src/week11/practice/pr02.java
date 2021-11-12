package week11.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pr02 extends JFrame {
    public pr02() {
        setTitle("드래깅동안 YELLOW");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.setBackground(Color.GREEN);
        MyMouseListener listener = new MyMouseListener();
        c.addMouseListener(listener);
        c.addMouseMotionListener(listener);

        setSize(300, 200);
        setVisible(true);
    }

    class MyMouseListener extends MouseAdapter {
        @Override
        public void mouseDragged(MouseEvent e) {
            Component c = (Component) e.getSource();
            c.setBackground(Color.YELLOW);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            Component c = (Component) e.getSource();
            c.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new pr02();
    }
}
