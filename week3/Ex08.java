package ch3;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 몇개?");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] check = new int[101];
        for(int i=0; i<arr.length; i++) {
            while(true) {
                arr[i] = (int)(Math.random()*100+1);
                if(check[arr[i]] == 0) {
                    check[arr[i]] = 1;
                    break;
                }
            }
        }
        for(int i=0; i<arr.length; i++) {
            if(i!=0 && i%10 == 0) System.out.printf("%n");
            System.out.print(arr[i] + " ");
        }
    }
}