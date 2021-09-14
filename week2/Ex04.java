import java.util.*;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 3개 입력>>");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int ret;
        if (n1 < n2) {
            if (n2 < n3) {
                ret = n2;
            } else if (n3 < n1) {
                ret = n1;
            } else {
                ret = n3;
            }
        } else {
            if (n1 < n3) {
                ret = n1;
            } else if (n3 < n2) {
                ret = n3;
            } else {
                ret = n2;
            }
        }
        System.out.println("중간 값은 " + ret);
        scanner.close();
    }
}
