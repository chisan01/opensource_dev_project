package ch2;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("2자리수 정수 입력(10~99)>>");
        int n = scanner.nextInt();
        int n_ten = n/10;
        int n_one = n%10;
        if(n_ten == n_one) {
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        }
        else {
            System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
        }
        scanner.close();
    }
}
