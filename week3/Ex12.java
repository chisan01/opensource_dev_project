package ch3;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i<args.length; i++) {
            try {
                sum += Integer.parseInt(args[i]);
            }
            catch(NumberFormatException e) {
            }
        }
        System.out.println(sum);

    }
}