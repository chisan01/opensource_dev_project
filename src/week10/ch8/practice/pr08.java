package week10.ch8.practice;

import java.io.File;

public class pr08 {
    public static void main(String[] args) {
        File root = new File("C:\\");
        File[] subfiles = root.listFiles();
        File ret = null;
        for(File subfile : subfiles) {
            if(!subfile.isFile()) continue;
            if(ret == null) ret = subfile;
            else if(ret.length() < subfile.length()) ret = subfile;
        }
        System.out.println("가장 큰 파일은 " + ret.getPath() + " " + ret.length() + "바이트");
    }
}
