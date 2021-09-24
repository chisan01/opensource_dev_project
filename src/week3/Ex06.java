package week3;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        int[] count = new int[unit.length];
        System.out.print("금액을 입력하시오>>");
        int money = scanner.nextInt();
        for(int i=0; i<unit.length; i++) {
            count[i] = money/unit[i];
            money %= unit[i];
        }
        for(int i=0; i<unit.length; i++) {
            if(count[i] != 0) {
                System.out.println(unit[i] + "원 짜리 : " + count[i] + "개");
            }
        }
    }
}
