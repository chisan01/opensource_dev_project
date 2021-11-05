package week10.ch8.practice;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class pr14 {
    public static void main(String[] args) {
        System.out.println("***** 파일 탐색기입니다. *****");
        Scanner scanner = new Scanner(System.in);
        File f = new File("C:\\");

        System.out.println("\t[" + f.getPath() +"]");
        File[] subfiles = f.listFiles();
        for(File subfile : subfiles) {
            if(subfile.isFile()) System.out.print("file\t");
            else System.out.print("dir\t");
            System.out.print(subfile.length() + "바이트\t");
            System.out.println(subfile.getName());
        }

        while(true) {
            System.out.print(">>");
            String input = scanner.next();
            if(input.equals("그만")) break;
            else if(input.equals("..")) {
                f = new File(f.getParent());
            }
            else if(input.equals("rename")) {
                String cmd = scanner.nextLine();
                StringTokenizer st = new StringTokenizer(cmd);
                String[] S = new String[2];
                int i=0;
                while(st.hasMoreTokens()) {
                    S[i++] = st.nextToken();
                }
                if(i==2) {
                    File f2 = new File(f.getPath() + "\\" + S[0]);
                    f2.renameTo(new File(f.getPath() + "\\" + S[1]));
                    System.out.println(S[0] + "를 " + S[1] + " 이름 변경하였습니다.");
                }
                else {
                    System.out.println("두 개의 파일명이 주어지지 않았습니다.!");
                    continue;
                }
            }
            else if(input.equals("mkdir")) {
                String new_dir = scanner.next();
                File f2 = new File(f.getPath() + "\\" + new_dir);
                if(f2.exists()) System.out.println("이미 해당 디렉터리가 존재합니다.");
                else {
                    f2.mkdir();
                    System.out.println(f2.getName() + " 디렉터리를 생성하였습니다.");
                }
            }
            else {
                f = new File(f.getPath() + "\\" + input);
            }
            System.out.println("\t[" + f.getPath() +"]");
            subfiles = f.listFiles();
            for(File subfile : subfiles) {
                if(subfile.isFile()) System.out.print("file\t");
                else System.out.print("dir\t");
                System.out.print(subfile.length() + "바이트\t");
                System.out.println(subfile.getName());
            }
        }
    }
}
