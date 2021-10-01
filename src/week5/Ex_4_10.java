package week5;

class Sample {
    public int a;
    private int b;
    int c;
}

public class Ex_4_10 {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10;
//        aClass.b = 10;
//        b는 접근지정자가 private으로 동일 클래스 내에서만 접근이 허용된다.
        aClass.c = 10;
    }
}
