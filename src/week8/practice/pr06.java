package week8.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Location {
    private String name;
    private int x, y;
    public Location(String name, int x, int y) {
        this.name=name;
        this.x=x;
        this.y=y;
    }
    public void show() {
        System.out.println(name + " " + x + " " + y);
    }
}

public class pr06 {
    static void printLine() {
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("도시,경도,위도를 입력하세요.");
        HashMap<String, Location> H = new HashMap<>();
        for(int i=0; i<4; i++) {
            System.out.print(">> ");
            String input = scanner.nextLine();
            String[] inputs = input.split(", ");
            Location city = new Location(inputs[0],
                    Integer.parseInt(inputs[1]),
                    Integer.parseInt(inputs[2]));
            H.put(inputs[0], city);
        }
        printLine();
        Set<String> keys = H.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()) {
            H.get(it.next()).show();
        }
        printLine();
        while(true) {
            System.out.print("도시 이름 >> ");
            String search = scanner.next();
            if(search.equals("그만")) break;
            if(H.containsKey(search)) {
                H.get(search).show();
            }
            else {
                System.out.println(search + "는 없습니다.");
            }
        }
        scanner.close();
    }
}
