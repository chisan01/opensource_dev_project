package week6;

import java.awt.*;

class TV {
    private int size;
    public TV(int size) {
        this.size = size;
    }
    protected int getSize() {
        return size;
    }
}

class ColorTV extends TV {
    private int color;
    public ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }
    protected int getColor() {
        return color;
    }
    public void printProperty() {
        System.out.println(getSize() + "인치 " + getColor() + "컬러");
    }
}

class IPTV extends ColorTV {
    private String address;
    public IPTV(String address, int size, int color) {
        super(size, color);
        this.address = address;
    }
    protected String getAddress() {
        return address;
    }
    @Override
    public void printProperty() {
        System.out.println("나의 IPTV는 " + getAddress() + " 주소의 " + getSize() + "인치 " + getColor() + "컬러");
    }
}

public class practice02 {
    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 1024);
        iptv.printProperty();
    }
}
