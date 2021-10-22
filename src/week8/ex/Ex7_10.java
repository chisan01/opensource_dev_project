package week8.ex;

public class Ex7_10 {
    public static <T> MyStack<T> reverse(MyStack<T> a) {
        MyStack<T> s = new MyStack<T>();
        while (true) {
            T tmp;
            tmp = a.pop(); // 원래 스택에서 요소 하나를 꺼냄
            if (tmp==null) // 스택이 비었음
                break;
            else
                s.push(tmp); // 새 스택에 요소를 삽입
        }
        return s; // 새 스택을 반환
    }
    public static void main(String[] args) {
// Double 타입의 GStack 생성
        MyStack<Double> gs =
                new MyStack<Double>();
// 5개의 요소를 스택에 push
        for (int i=0; i<5; i++) {
            gs.push((double)i);
        }
        gs = reverse(gs);
        for (int i=0; i<5; i++) {
            System.out.println(gs.pop());
        }
    }
}
