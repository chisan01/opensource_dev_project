package ch3;

public class Ex02 {
    public static void main(String[] args) {
        int[][] n = {{1}, {1,2,3,}, {1}, {1,2,3,4}, {1,2}};
        for(int[] x : n) {
            for(int xy : x) {
                System.out.print(xy + " ");
            }
            System.out.println();
        }
    }
}
