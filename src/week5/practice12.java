package week5;

import java.util.Scanner;

class ReservationSystem {
    Scanner scanner = new Scanner(System.in);
    private String[] S = new String[10];
    private String[] A = new String[10];
    private String[] B = new String[10];

    ReservationSystem() {
        for(int i=0; i<10; i++) {
            S[i] = "---";
            A[i] = "---";
            B[i] = "---";
        }
    }
    private void WrongInput() {
        System.out.println("잘못된 입력입니다. 다시 입력하십시오.");
    }
    private void reservation() {
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        int n;
        while(true) {
            n = scanner.nextInt();
            if (n == 1 || n == 2 || n == 3) break;
            WrongInput();
        }
        switch(n) {
            case 1:
                System.out.print("S>>");
                for(int i=0; i<S.length; i++) System.out.print(" " + S[i]);
                System.out.println();
                while(true) {
                    System.out.print("이름>>"); String name = scanner.next();
                    System.out.print("번호>>"); int num = scanner.nextInt();
                    if(0 < num && num <= S.length && S[num-1].equals("---")) {
                        S[num-1] = name;
                        break;
                    }
                    WrongInput();
                }
                break;
            case 2:
                System.out.print("A>>");
                for(int i=0; i<A.length; i++) System.out.print(" " + A[i]);
                System.out.println();
                while(true) {
                    System.out.print("이름>>"); String name = scanner.next();
                    System.out.print("번호>>"); int num = scanner.nextInt();
                    if(0 < num && num <= A.length && A[num-1].equals("---")) {
                        A[num-1] = name;
                        break;
                    }
                    WrongInput();
                }
                break;
            case 3:
                System.out.print("B>>");
                for(int i=0; i<B.length; i++) System.out.print(" " + B[i]);
                System.out.println();
                while(true) {
                    System.out.print("이름>>"); String name = scanner.next();
                    System.out.print("번호>>"); int num = scanner.nextInt();
                    if(0 < num && num <= B.length && B[num-1].equals("---")) {
                        B[num-1] = name;
                        break;
                    }
                    WrongInput();
                }
                break;
        }
    }
    private void show() {
        System.out.print("S>>");
        for(int i=0; i<S.length; i++) System.out.print(" " + S[i]);
        System.out.println();
        System.out.print("A>>");
        for(int i=0; i<A.length; i++) System.out.print(" " + A[i]);
        System.out.println();
        System.out.print("B>>");
        for(int i=0; i<B.length; i++) System.out.print(" " + B[i]);
        System.out.println();
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }
    private void cancel() {
        System.out.print("좌석 S:1, A:2, B:3>>");
        int n;
        while(true) {
            n = scanner.nextInt();
            if (n == 1 || n == 2 || n == 3) break;
            WrongInput();
        }
        switch(n) {
            case 1:
                System.out.print("S>>");
                for(int i=0; i<S.length; i++) System.out.print(" " + S[i]);
                System.out.println();
                while(true) {
                    System.out.print("이름>>"); String name = scanner.next();
                    int i = 0;
                    for(; i<S.length; i++) {
                        if(S[i].equals(name)) break;
                    }
                    if(i!=S.length) {
                        S[i] = "---";
                        break;
                    }
                    else WrongInput();
                }
                break;
            case 2:
                System.out.print("A>>");
                for(int i=0; i<A.length; i++) System.out.print(" " + A[i]);
                System.out.println();
                while(true) {
                    System.out.print("이름>>"); String name = scanner.next();
                    int i = 0;
                    for(; i<A.length; i++) {
                        if(A[i].equals(name)) break;
                    }
                    if(i!=A.length) {
                        A[i] = "---";
                        break;
                    }
                    else WrongInput();
                }
                break;
            case 3:
                System.out.print("B>>");
                for(int i=0; i<B.length; i++) System.out.print(" " + B[i]);
                System.out.println();
                while(true) {
                    System.out.print("이름>>"); String name = scanner.next();
                    int i = 0;
                    for(; i<B.length; i++) {
                        if(B[i].equals(name)) break;
                    }
                    if(i!=B.length) {
                        B[i] = "---";
                        break;
                    }
                    else WrongInput();
                }
                break;
        }

    }
    private void menu(int n) {
        switch(n) {
            case 1:
                reservation();
                break;
            case 2:
                show();
                break;
            case 3:
                cancel();
                break;
            default:
                WrongInput();
                break;
        }
    }
    public void start() {
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        int n;
        while(true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            n = scanner.nextInt();
            if(n==4) break;
            menu(n);
        }
    }
}

public class practice12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReservationSystem rs = new ReservationSystem();
        rs.start();
        scanner.close();
    }
}
