package week10.ch8.practice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class pr06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        String path1, path2;
        System.out.print("첫번째 파일 이름을 입력하세요>>");
        path1 = scanner.next();
        System.out.print("두번째 파일 이름을 입력하세요>>");
        path2 = scanner.next();

        try {
            FileReader src1 = new FileReader(path1);
            FileReader src2 = new FileReader(path2);
            FileWriter dest = new FileWriter("appended.txt");

            int c;
            while((c=src1.read()) != -1) {
                dest.write((char)c);
            }
            while((c=src2.read()) != -1) {
                dest.write((char)c);
            }

            System.out.println("프로젝트 폴더 밑에 appended.txt 파일에 저장하였습니다.");
            src1.close(); src2.close(); dest.close();
        } catch (IOException e) {
            System.out.println("입출력 오류입니다.");
        }
        scanner.close();
    }
}
