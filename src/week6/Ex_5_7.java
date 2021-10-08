package week6;

abstract class Calculator {
    public abstract int add(int a, int b);
    public abstract int subtract(int a, int b);
    public abstract double average(int[] a);
}

class GoodCalc extends Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
    @Override
    public double average(int[] a) {
        double sum = 0;
        for(int item : a) sum += item;
        return sum/a.length;
    }
}

public class Ex_5_7 {
    public static void main(String[] args) {
        GoodCalc c = new GoodCalc();
        System.out.println(c.add(2,3));
        System.out.println(c.subtract(2,3));
        System.out.println(c.average(new int[] {2, 3, 4}));
    }
}
