import java.util.*;

/*
1. N의 값을 받음
N의 값을 deque에 다 넣음
첫 번째 값 삭제
다음 첫 번째 값 뒤로 추가

while(!(deque.size == 1))
*/


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<>();
        int num = sc.nextInt();

        for (int i = 1; i < num + 1; i++ ) dq.addLast(i);

        while(!(dq.size() == 1)){
            dq.pollFirst();
            dq.addLast(dq.pollFirst());
        }

        System.out.println(dq.pollFirst());
    
    }
}