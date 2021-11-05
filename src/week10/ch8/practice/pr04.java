package week10.ch8.practice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class pr04 {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\windows\\system.ini");
            Scanner scanner = new Scanner(new FileReader(f.getPath()));
            System.out.println(f.getPath() + " 파일을 읽어 출력합니다.");
            int cnt = 1;
            while(scanner.hasNextLine()) {
                String input = scanner.nextLine();
                System.out.printf("%4d: ", cnt++);
                System.out.println(input);
            }
            scanner.close();
        } catch(IOException e) {
            System.out.println("입출력 오류");
        }

    }
}
