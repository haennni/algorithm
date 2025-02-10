/*
1. 입력을 받은 뒤 문자열에 push, size, empty, pop이 포함되는지 확인
2. 각 포함되는 문자열에 맞는 로직을 실행
3. push일 경우, split으로 int를 추출하여 Stack에 추가
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        
        int num = sc.nextInt();

        for (int i = 0; i < num + 1; i++){
            String str = sc.nextLine();

            if (str.contains("push")){
                String[] arr = str.split(" ");
                stack.push(Integer.parseInt(arr[1]));
            }else if(str.contains("size")){
                System.out.println(stack.size());
            }else if (str.contains("empty")){
                boolean result = stack.empty();
                if (result){
                    System.out.println("1");
                }else {
                    System.out.println("0");
                }
            }else if (str.contains("pop")){
                System.out.println(stack.pop());
            }else if (str.contains("top")){
                System.out.println(stack.peek());
            }
        }
    }
}