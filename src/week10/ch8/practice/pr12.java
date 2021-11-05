package week10.ch8.practice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class pr12 {
    public static void main(String[] args) {
        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("대상 파일명 입력>>");
            String dest = scanner.next();

            Vector<String> file = new Vector<>();
            File f = new File(dest);
            scanner = new Scanner(new FileReader(f.getPath()));
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                file.add(line);
            }

            scanner = new Scanner(System.in);
            while(true) {
                System.out.print("검색할 단어나 문장>> ");
                String search = scanner.nextLine();
                if(search.equals("그만")) break;
                for(int i=0; i<file.size(); i++) {
                    if(file.elementAt(i).contains(search))
                        System.out.println((i+1)+": "+file.elementAt(i));
                }
            }
            System.out.println("프로그램을 종료합니다.");
            scanner.close();
        } catch(IOException e) {
            System.out.println("입출력 오류");
        }

    }
}
