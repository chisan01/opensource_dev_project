package week11.ex;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ex10_7 extends JFrame {
    private JLabel la = new JLabel();
    public Ex10_7() {
        setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addKeyListener(new MyKeyListener());
        c.add(la);
        setSize(300,150);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }
    
    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            la.setText(e.getKeyText(e.getKeyCode()));
            Container contentPane = Ex10_7.this.getContentPane();
            if(e.getKeyChar() == '%')
                contentPane.setBackground(Color.YELLOW);
            else if(e.getKeyCode() == KeyEvent.VK_F1)
                contentPane.setBackground(Color.GREEN);
        }
    }
    public static void main(String [] args) {
        new Ex10_7();
    }
}
