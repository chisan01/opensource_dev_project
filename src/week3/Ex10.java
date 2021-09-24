package week3;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[4][4];

        for(int k=0; k<10; k++) {
            while(true) {
                int i = (int)(Math.random()*4);
                int j = (int)(Math.random()*4);
                if(arr[i][j] == 0) {
                    arr[i][j] = (int)(Math.random()*10+1);
                    break;
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(j!=0) System.out.printf("\t");
                System.out.print(arr[i][j]);
            }
            System.out.printf("%n");
        }
    }
}