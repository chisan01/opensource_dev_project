package week6;

import java.util.Scanner;

abstract class Shape2 {
    private Shape2 next;
    public Shape2() { next = null; }
    public void setNext(Shape2 obj) { next = obj; }
    public Shape2 getNext() { return next; }
    public abstract void draw();
}

class Line2 extends Shape2 {
    public void draw() { System.out.println("Line"); }
}

class Rect2 extends Shape2 {
    public void draw() { System.out.println("Rect"); }
}

class Circle2 extends Shape2 {
    public void draw() { System.out.println("Circle"); }
}

class beauty {
    Scanner scanner = new Scanner(System.in);
    private Shape2 head;
    public beauty() {
        head = null;
    }
    private void insert() {
        System.out.print("Line(1), Rect(2), Circle(3)>>");
        int sort = scanner.nextInt();

        if(head == null) {
            switch (sort) {
                case 1:
                    head = new Line2();
                    break;
                case 2:
                    head = new Rect2();
                    break;
                case 3:
                    head = new Circle2();
                    break;
                default:
                    break;
            }
        }
        else {
            Shape2 cur = head;
            while(cur.getNext() != null) {
                cur = cur.getNext();
            }
            switch (sort) {
                case 1:
                    cur.setNext(new Line2());
                    break;
                case 2:
                    cur.setNext(new Rect2());
                    break;
                case 3:
                    cur.setNext(new Circle2());
                    break;
                default:
                    break;
            }
        }
    }
    private void delete() {
        System.out.print("삭제할 도형의 위치>>");
        int pos = scanner.nextInt();

        if(pos==0) {
            if(head == null) {
                System.out.println("삭제할 수 없습니다.");
                return;
            }
            head = head.getNext();
        }
        else {
            Shape2 pre = head;
            Shape2 cur = head;
            for(int i=0; i<pos; i++) {
                if(cur==null) break;
                pre = cur;
                cur = cur.getNext();
            }
            if(cur==null) {
                System.out.println("삭제할 수 없습니다.");
                return;
            }
            pre.setNext(cur.getNext());
        }
    }
    private void showAll() {
        Shape2 cur = head;
        while(cur != null) {
            cur.draw();
            cur = cur.getNext();
        }
    }
    public void run() {
        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        while (true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            int cmd = scanner.nextInt();
            if (cmd == 4) {
                System.out.println("beauty을 종료합니다.");
                break;
            }
            switch (cmd) {
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    showAll();
                    break;
                default:
                    break;
            }
        }
    }
}

public class practice12 {
    public static void main(String[] args) {
        beauty b = new beauty();
        b.run();
    }
}
