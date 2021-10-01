package week5;

import java.util.Scanner;

class Phone {
    private String name, tel;
    Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
    public boolean searchName(String name) {
        return this.name.equals(name);
    }
    public void show() {
        System.out.println(name + "의 번호는 " + tel + " 입니다.");
    }
}

public class practice08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원수>>");
        int n = scanner.nextInt();
        Phone[] phonebook = new Phone[n];
        for(int i=0; i<phonebook.length; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name = scanner.next();
            String tel = scanner.next();
            phonebook[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");

        while(true) {
            System.out.print("검색할 이름>>");
            String name = scanner.next();
            if(name.equals("그만")) break;

            int i=0;
            for(; i<phonebook.length; i++) {
                if(phonebook[i].searchName(name)) break;
            }
            if(i==phonebook.length)
                System.out.println(name + " 이 없습니다.");
            else
                phonebook[i].show();
        }
    }
}
