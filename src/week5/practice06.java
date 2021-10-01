package week5;

import java.util.Scanner;

class Circle {
    private double x, y;
    private int radius;
    public Circle(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void show() {
        System.out.printf("가장 면적인 큰 원은 (%.1f,%.1f)%d%n", x, y, radius);
    }
}
public class practice06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c[] = new Circle[3];
        for(int i=0; i<c.length; i++) {
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Circle(x, y, radius);
        }
        int max_index = 0;
        for(int i=1; i<c.length; i++) {
            if(c[max_index].getRadius() < c[i].getRadius()) {
                max_index = i;
            }
        }
        c[max_index].show();
        scanner.close();
    }
}
