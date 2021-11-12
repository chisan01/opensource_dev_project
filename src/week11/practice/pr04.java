package week11.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class pr04 extends JFrame {
    private JLabel jl = new JLabel("Love Java");

    public pr04() {
        setTitle("Left 키로 문자열 이동");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_LEFT) {
                    String str = jl.getText();
                    String ret = str.substring(1)+str.charAt(0);
                    jl.setText(ret);
                }
            }
        });
        c.add(jl);

        setSize(300, 150);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }
    public static void main(String[] args) {
        new pr04();
    }
}
