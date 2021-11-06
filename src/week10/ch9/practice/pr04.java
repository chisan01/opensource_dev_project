package week10.ch9.practice;

import javax.swing.*;
import java.awt.*;

public class pr04 extends JFrame {
    pr04() {
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Color[] colors = new Color[10];
        colors[0] = Color.RED;
        colors[1] = Color.ORANGE;
        colors[2] = Color.YELLOW;
        colors[3] = Color.GREEN;
        colors[4] = Color.CYAN;
        colors[5] = Color.BLUE;
        colors[6] = Color.MAGENTA;
        colors[7] = Color.GRAY;
        colors[8] = Color.PINK;
        colors[9] = Color.LIGHT_GRAY;

        Container c = getContentPane();
        c.setLayout(new GridLayout(1, 10));
        for(int i=0; i<10; i++) {
            c.add(new JButton(Integer.toString(i)));
            c.getComponent(i).setBackground(colors[i]);
        }

        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new pr04();
    }
}
