package week7.practice;

import java.util.Calendar;
import java.util.Scanner;

public class practice_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");

        System.out.print("황기태 시작 <Enter>키>>");
        scanner.nextLine();
        Calendar now = Calendar.getInstance();
        int start1 = now.get(Calendar.SECOND);
        System.out.println("\t현재 초 시간 = " + start1);

        System.out.print("10초 예상 후 <Enter>키>>");
        scanner.nextLine();
        now = Calendar.getInstance();
        int end1 = now.get(Calendar.SECOND);
        System.out.println("\t현재 초 시간 = " + end1);
        int ret1 = (end1 + 60 - start1)%60;

        System.out.print("이재문 시작 <Enter>키>>");
        scanner.nextLine();
        now = Calendar.getInstance();
        int start2 = now.get(Calendar.SECOND);
        System.out.println("\t현재 초 시간 = " + start2);

        System.out.print("10초 예상 후 <Enter>키>>");
        scanner.nextLine();
        now = Calendar.getInstance();
        int end2 = now.get(Calendar.SECOND);
        System.out.println("\t현재 초 시간 = " + end2);
        int ret2 = (end2 + 60 - start2)%60;

        System.out.print("황기태의 결과 " + ret1 + ", 이재문의 결과 " + ret2 + ", 승자는 ");
        if(Math.abs(10-ret1) < Math.abs(10-ret2)) System.out.println("황기태");
        else if(Math.abs(10-ret1) > Math.abs(10-ret2)) System.out.println("이재문");
        else System.out.println("없습니다");
    }
}
