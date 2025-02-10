/*
1. 정수를 받은 뒤 그 만큼 반복문을 진행한다.
2. push, front, size, empty, pop이 각각 문자열에 포함되는지 파악하고, 
포함된다면 맞는 로직을 실행한다.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int num = sc.nextInt();
        String s = "";

        for (int i = 0; i < num + 1; i++){
            s = sc.nextLine();

            if (s.contains("push")){
                String[] arr = s.split(" ");
                q.add(Integer.parseInt(arr[1]));
            }else if(s.contains("front")){
                System.out.println(q.peek());
            }else if(s.contains("size")){
                System.out.println(q.size());
            }else if(s.contains("empty")){
                if (q.isEmpty()){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            }else if (s.contains("pop")){
                System.out.println(q.poll());
            }
        }
    }
}