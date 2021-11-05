package week10.ch8.practice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class pr02 {
    public static void main(String args[]) {
        FileReader fin = null;
        try {
            File f = new File("c:\\temp\\phone.txt");
            fin = new FileReader(f.getPath());
            System.out.println(f.getPath()+"를 출력합니다.");
            int c;
            while((c=fin.read()) != -1) {
                System.out.print((char)c);
            }
            fin.close();
        }
        catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
