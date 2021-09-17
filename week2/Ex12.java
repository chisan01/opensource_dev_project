package ch2;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("연산>>");

        double a = scanner.nextDouble();
        String input = scanner.next();
        char op = input.charAt(0);
        double b = scanner.nextDouble();
        double ret;
        switch (op) {
            case '+':
                ret = a + b;
                System.out.printf("%d%c%d의 계산 결과는 %d", (int)a, op, (int)b, (int)ret);
                break;
            case '-':
                ret = a - b;
                System.out.printf("%d%s%d의 계산 결과는 %d", (int)a, op, (int)b, (int)ret);
                break;
            case '*':
                ret = a * b;
                System.out.printf("%d%s%d의 계산 결과는 %d", (int)a, op, (int)b, (int)ret);
                break;
            case '/':
                if(b==0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    break;
                }
                ret = a / b;
                System.out.printf("%d%s%d의 계산 결과는 %d", (int)a, op, (int)b, (int)ret);
                break;
        }
    }
}
