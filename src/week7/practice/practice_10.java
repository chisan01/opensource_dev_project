package week7.practice;

import java.util.Scanner;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public boolean check() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("[" + name + "]:<Enter>");
        scanner.nextLine();
        int n2 = (int) (Math.random() * 3 + 1);
        int n1 = (int) (Math.random() * 3 + 1);
        int n3 = (int) (Math.random() * 3 + 1);
        System.out.print("\t\t" + n1 + "\t" + n2 + "\t" + n3 + "\t");
        return n1 == n2 && n2 == n3;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class practice_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1번째 선수 이름>>");
        String name1 = scanner.next();
        Person player1 = new Person(name1);
        System.out.print("2번째 선수 이름>>");
        String name2 = scanner.next();
        Person player2 = new Person(name2);

        while(true) {
            if(player1.check()) {
                System.out.println(player1 + "님이 이겼습니다!");
                break;
            }
            else System.out.println("아쉽군요!");
            if(player2.check()) {
                System.out.println(player2 + "님이 이겼습니다!");
                break;
            }
            else System.out.println("아쉽군요!");
        }

        scanner.close();
    }
}
