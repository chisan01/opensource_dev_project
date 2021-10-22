package week8.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class pr08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("** 포인트 과닐 프로그램입니다 **");
        HashMap<String, Integer> clients = new HashMap<>();
        while(true) {
            System.out.print("이름과 포인트 입력>> ");
            String name = scanner.next();
            if(name.equals("그만")) break;
            int score = scanner.nextInt();

            if(clients.containsKey(name)) {
                score += clients.get(name);
                clients.remove(name);
            }
            clients.put(name, score);

            Set<String> keys = clients.keySet();
            Iterator<String> it = keys.iterator();
            while(it.hasNext()) {
                String key = it.next();
                System.out.print("("+key+","+clients.get(key)+")");
            }
            System.out.println();
        }
        scanner.close();
    }
}
