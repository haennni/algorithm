/*
1. split을 통해서 다 나눔 -> str 길이만큼 반복
2. 만약에 '('라면 stack.push
3. ')'라면 stack이 비어있다면 NO출룍, 비어있지않는다면 stack.pop으로 가장 최근 괄호 삭제
*/

import java.util.*;

public class Main {

    public static String result(int size, String str){
        Stack<String> stack = new Stack<>();
        String[] arr = str.split("");
        String s = "";

        for (int i = 0; i < size; i++){
            if (arr[i].equals("(")){
                stack.push("(");
            }else if (arr[i].equals(")")){
                if (!stack.isEmpty()){
                    stack.pop();
                }else{
                    return "No";
                }
            }
        }
        if (stack.isEmpty()){
            s = "Yes";
        } else{
            s = "No";
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int size = str.length();

        System.out.println(result(size, str));
    }
}