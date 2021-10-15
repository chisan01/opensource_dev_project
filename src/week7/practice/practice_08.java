package week7.practice;

import java.util.Scanner;

public class practice_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
        String s = scanner.nextLine();
        for(int i=1; i<=s.length(); i++) {
            System.out.print(s.substring(i));
            for(int j=0; j<i; j++) System.out.print(s.charAt(j));
            System.out.println();
        }
    }
}
