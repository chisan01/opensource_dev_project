package week8.practice;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class pr04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> V = new Vector<>();
        while(true) {
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            int input = scanner.nextInt();
            if(input == 0) break;
            V.add(input);
            Iterator<Integer> I = V.iterator();
            int sum = 0;
            while(I.hasNext()) {
                int n = I.next();
                System.out.print(n + " ");
                sum += n;
            }
            System.out.println();
            System.out.println("현재 평균 " + sum/V.size());
        }
        scanner.close();
    }
}
