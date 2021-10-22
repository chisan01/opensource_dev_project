package week8.practice;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

abstract class Shape {
    public Shape() { }
    public abstract void draw();
}

class Line extends Shape {
    public void draw() { System.out.println("Line"); }
}

class Rect extends Shape {
    public void draw() { System.out.println("Rect"); }
}

class Circle extends Shape {
    public void draw() { System.out.println("Circle"); }
}

public class pr10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("그래픽 에디터 beauty를 실행합니다.");
        Vector<Shape> V = new Vector<>();
        while(true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            int input = scanner.nextInt();
            if(input == 4) break;
            switch (input) {
                case 1: // 삽입
                    System.out.print("Line(1), Rect(2), Circle(3)>>");
                    int sort = scanner.nextInt();
                    switch(sort) {
                        case 1:
                            V.add(new Line());
                            break;
                        case 2:
                            V.add(new Rect());
                            break;
                        case 3:
                            V.add(new Circle());
                            break;
                        default:
                            break;
                    }
                    break;
                case 2: // 삭제
                    System.out.print("삭제할 도형의 위치>>");
                    int n = scanner.nextInt();
                    if(n < V.size()) V.remove(n);
                    else System.out.println("삭제할 수 없습니다.");
                    break;
                case 3: // 모두보기
                    Iterator<Shape> it = V.iterator();
                    while(it.hasNext()) it.next().draw();
                    break;
                default:
                    break;
            }
        }
        System.out.println("beauty를 종료합니다.");
        scanner.close();
    }
}
