package week11.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class pr06 extends JFrame {
    private JLabel jl = new JLabel("c");

    public pr06() {
        setTitle("클릭 연습 용 응용프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        jl.setLocation(200, 200);
        jl.setSize(10, 10);
        jl.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x, y;
                x = (int) (Math.random() * (c.getSize().width - 10));
                y = (int) (Math.random() * (c.getSize().height - 10));
                jl.setLocation(x, y);
            }
        });
        c.add(jl);

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new pr06();
    }
}
