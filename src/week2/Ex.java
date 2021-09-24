package week2;

import java.util.Scanner;

class Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
        System.out.print("철수 >> ");
        String chulsoo = scanner.nextLine();
        System.out.print("영희 >> ");
        String younghee = scanner.nextLine();

        if (chulsoo.equals(younghee))
            System.out.println("무승부입니다.");
        else if (chulsoo.equals("가위")) {
            if (younghee.equals("바위"))
                System.out.println("영희가 이겼습니다.");
            else
                System.out.println("철수가 이겼습니다.");
        } else if (chulsoo.equals("바위")) {
            if (younghee.equals("보"))
                System.out.println("영희가 이겼습니다.");
            else
                System.out.println("철수가 이겼습니다.");
        } else if (chulsoo.equals("보")) {
            if (younghee.equals("가위"))
                System.out.println("영희가 이겼습니다.");
            else
                System.out.println("철수가 이겼습니다.");
        }
        scanner.close();
    }
}