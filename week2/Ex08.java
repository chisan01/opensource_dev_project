import java.util.*;

public class Ex08 {
    static boolean collapse(int x1, int y1, int x2, int y2) {
        if (x1 > x2)
            return collapse(x2, y1, x1, y2);
        if (y1 > y2)
            return collapse(x1, y2, x2, y1);

        if (x2 < 100 || x1 > 200 || y2 < 100 || y1 > 200)
            return false;
        else
            return true;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if (collapse(x1, y1, x2, y2))
            System.out.println("충돌합니다.");
        else
            System.out.println("충돌하지않습니다.");
        scanner.close();
    }
}
