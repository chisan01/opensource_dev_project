package week10.ch9.ex;

import javax.swing.*;

public class Ex9_1 extends JFrame {
    public Ex9_1() {
        setTitle("300x300 스윙 프레임 만들기");
        setSize(300,300); // 프레임 크기 300x300
        setVisible(true); // 프레임 출력
    }
    public static void main(String[] args) {
        Ex9_1 frame = new Ex9_1();
    }
}