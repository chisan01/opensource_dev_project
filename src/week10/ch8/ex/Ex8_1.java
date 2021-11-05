package week10.ch8.ex;

import java.io.FileReader;
import java.io.IOException;

public class Ex8_1 {
    public static void main(String[] args) {
        FileReader fin = null;
        try {
            fin = new FileReader("c:\\windows\\system.ini");
            int c;
            while ((c = fin.read()) != -1) { // 한 문자씩 파일 끝까지 읽기
                System.out.print((char)c);
            }
            fin.close();
        }
        catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
