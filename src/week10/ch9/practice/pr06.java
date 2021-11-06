package week10.ch9.practice;

import javax.swing.*;
import java.awt.*;

public class pr06 extends JFrame {
    pr06() {
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        for(int i=0; i<20; i++) {
            JLabel jl = new JLabel();
            jl.setOpaque(true);
            jl.setSize(10, 10);
            jl.setBackground(Color.BLUE);
            int x = (int)(Math.random()*200)+50;
            int y = (int)(Math.random()*200)+50;
            jl.setLocation(x, y);
            c.add(jl);
        }

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new pr06();
    }
}
