/*
queue를 두개 만듬
q1 = 1 2 3 4 5 6 을 넣어놓음

while(q1.isEmpty)  
q1 poll()을 한 뒤에
q1.push(poll)을 한다.

q2 = 1 2 3 5 6



*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int num = sc.nextInt();
        int size = sc.nextInt();
        int count = 1;
        
        for (int i = 1; i < num + 1; i++){
            queue.add(i);
        }

        while(!queue.isEmpty()){
            int n = queue.poll();
            if (!(count == size)){
                queue.add(n);
                count++;
            }else{
                sb.append(n).append(" ");
                count = 1;
            }
        }
        System.out.println(sb.toString().trim());
    }
}