import java.util.*;

class Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("가위바위보 게임입니다. Rock, Scissor, Paper 중에서 입력하세요");
        System.out.print("철수 >> ");
        String chulsoo = scanner.nextLine();
        System.out.print("영희 >> ");
        String younghee = scanner.nextLine();

        if (chulsoo.equals(younghee))
            System.out.println("무승부입니다.");
        else if (chulsoo.equals("Scissor")) {
            if (younghee.equals("Rock"))
                System.out.println("영희가 이겼습니다.");
            else
                System.out.println("철수가 이겼습니다.");
        } else if (chulsoo.equals("Rock")) {
            if (younghee.equals("Paper"))
                System.out.println("영희가 이겼습니다.");
            else
                System.out.println("철수가 이겼습니다.");
        } else if (chulsoo.equals("Paper")) {
            if (younghee.equals("Scissor"))
                System.out.println("영희가 이겼습니다.");
            else
                System.out.println("철수가 이겼습니다.");
        }
        scanner.close();
    }
}