package ch3;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = {"가위", "바위", "보"};
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        while(true) {
            System.out.print("가위 바위 보!>>");
            String user = scanner.next();
            if(user.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
            }
            String com = arr[(int)(Math.random()*3)];
            String ret;
            if(user.equals(com)) {
                ret = "비겼습니다.";
            }
            else {
                if(user.equals("가위")) {
                    if(com.equals("바위"))
                        ret = "컴퓨터가 이겼습니다.";
                    else
                        ret = "사용자가 이겼습니다.";
                } else if(user.equals("바위")) {
                    if(com.equals("보"))
                        ret = "컴퓨터가 이겼습니다.";
                    else
                        ret = "사용자가 이겼습니다.";
                }
                else {
                    if(com.equals("가위"))
                        ret = "컴퓨터가 이겼습니다.";
                    else
                        ret = "사용자가 이겼습니다.";
                }
            }
            System.out.println("사용자 = " + user + " , 컴퓨터  = " + com + ", " + ret);
        }
    }
}
