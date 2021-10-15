package week7.practice;

import java.util.Scanner;

public class practice_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("겜블링 게임에 참여할 선수 숫자>>");
        int n = scanner.nextInt();
        Person[] peoples = new Person[n];
        for(int i=1; i<=n; i++) {
            System.out.print(i+"번째 선수 이름>>");
            String name = scanner.next();
            peoples[i-1] = new Person(name);
        }

        boolean end = false;
        while(!end) {
            for(int i=0; i<n; i++) {
                Person player = peoples[i];
                if(player.check()) {
                    System.out.println(player + "님이 이겼습니다!");
                    end = true;
                    break;
                }
                else System.out.println("아쉽군요!");
            }
        }

        scanner.close();
    }
}
