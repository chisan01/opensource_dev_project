package week8.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class pr02 {
    static double mean(ArrayList<String> arr) {
        double sum = 0;
        for(int i=0; i<arr.size(); i++) {
            char score = arr.get(i).charAt(0);
            switch(score) {
                case 'A':
                    sum += 4.0;
                    break;
                case 'B':
                    sum += 3.0;
                    break;
                case 'C':
                    sum += 2.0;
                    break;
                case 'D':
                    sum += 1.0;
                    break;
                case 'F':
                    sum += 0.0;
                    break;
                default:
                    break;
            }
        }
        return sum/arr.size();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        for(int i=0; i<6; i++) {
            String c = scanner.next();
            arr.add(c);
        }
        System.out.println(mean(arr));
        scanner.close();
    }
}
