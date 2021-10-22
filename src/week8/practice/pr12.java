package week8.practice;

import java.util.Vector;
import java.util.Scanner;

class Word {
    private String eng, kor;
    public Word(String eng, String kor) {
        this.eng = eng;
        this.kor = kor;
    }
    public boolean check(String kor) {
        return kor.equals(this.kor);
    }
    public String getEng() {
        return eng;
    }
    public String getKor() {
        return kor;
    }
}

public class pr12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Word> V = new Vector<>();
        V.add(new Word("painting", "그림"));
        V.add(new Word("bear", "곰"));
        V.add(new Word("eye", "눈"));
        V.add(new Word("picture", "사진"));
        V.add(new Word("society", "사회"));
        V.add(new Word("human", "인간"));
        V.add(new Word("love", "사랑"));
        V.add(new Word("animal", "동물"));

        System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");
        while(true) {
            System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3>> ");
            int menu = scanner.nextInt();
            if(menu == 3) break;
            switch(menu) {
                case 1: // 단어 테스트
                    System.out.println("현재 " + V.size() + "개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다.");
                    if(!V.isEmpty()) {
                        while(true) {
                            int[] visit = new int[V.size()];
                            String[] choose = new String[4];
                            // 정답 고르기
                            Word answer;
                            while(true) {
                                int index = (int)(Math.random()*V.size());
                                if(visit[index] == 0) {
                                    visit[index] = 1;
                                    answer = V.elementAt(index);
                                    break;
                                }
                            }
                            choose[0] = answer.getKor();
                            // 나머지 3개 보기 고르기
                            for(int i=1; i<4; i++) {
                                while(true) {
                                    int index = (int)(Math.random()*V.size());
                                    if(visit[index] == 0) {
                                        visit[index] = 1;
                                        choose[i] = V.elementAt(index).getKor();
                                        break;
                                    }
                                }
                            }
                            // 랜덤하게 섞기
                            for(int i=0; i<4; i++) {
                                int index = (int)(Math.random()*4);
                                String tmp = choose[i];
                                choose[i] = choose[index];
                                choose[index] = tmp;
                            }
                            // 문제 내기
                            int input;
                            while(true) {
                                try {
                                    System.out.println(answer.getEng()+"?");
                                    for(int i=1; i<=4; i++) {
                                        System.out.print("("+i+")"+choose[i-1] + " ");
                                    }
                                    System.out.print(":>");
                                    input = scanner.nextInt();
                                    break;
                                }
                                catch (Exception e) {
                                    System.out.println("숫자를 입력하세요 !!");
                                    scanner.nextLine();
                                }
                            }
                            if(input == -1) break;
                            if(answer.check(choose[input-1])) System.out.println("Excellent !!");
                            else System.out.println("No. !!");
                        }
                    }
                    break;
                case 2: // 단어 삽입
                    System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
                    while(true) {
                        System.out.print("영어 한글 입력 >> ");
                        String eng = scanner.next();
                        if(eng.equals("그만")) break;
                        String kor = scanner.next();
                        V.add(new Word(eng, kor));
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println("\"명품영어\"를 종료합니다.");
        scanner.close();
    }
}
