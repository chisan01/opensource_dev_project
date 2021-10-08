package week6;

interface PhoneInterface {
    int TIMEOUT = 10000;  // public static final 생략
    void sendCall();  // public abstract 생략
    void receiveCall();
    default void printLogo() {  // public 생략
        System.out.println("** Phone **");
    }
}

class SamsungPhone implements PhoneInterface {
    @Override
    public void sendCall() {
        System.out.println("띠리리리링");
    }
    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }

    public void flash() {
        System.out.println("전화기에 불이 켜졌습니다.");
    }
}

public class Ex_5_8 {
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();
    }
}
