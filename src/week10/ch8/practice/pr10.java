package week10.ch8.practice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class pr10 {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\temp\\phone.txt");
            Scanner scanner = new Scanner(new FileReader(f.getPath()));
            HashMap<String, String> phonebook = new HashMap<>();
            while(scanner.hasNextLine()) {
                String name = scanner.next();
                String phone = scanner.next();
                phonebook.put(name, phone);
            }

            scanner = new Scanner(System.in);
            System.out.println("총 "+phonebook.size()+"개의 전화번호를 읽었습니다.");
            while(true) {
                System.out.print("이름>> ");
                String name = scanner.next();
                if(name.equals("그만")) break;
                String find = phonebook.get(name);
                if(find != null) System.out.println(find);
                else System.out.println("찾는 이름이 없습니다.");
            }
            scanner.close();
        } catch(IOException e) {
            System.out.println("입출력 오류");
        }

    }
}
