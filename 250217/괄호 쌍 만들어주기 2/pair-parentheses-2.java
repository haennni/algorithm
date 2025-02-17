import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 1;
        int left_max = Integer.MIN_VALUE;
        int rigth_max = Integer.MIN_VALUE;
        /*(의 최댓값을 찾자*/
        for (int i = 0; i < str.length() - 1; i++){
            if (str.charAt(i) == '(') {
                if (str.charAt(i + 1) == '(')
                count++;
            }else{
                left_max = Math.max(left_max, count);
            }
        }
        count = 1;
        for (int i = 0; i < str.length() - 1; i++){
        if (str.charAt(i) == ')') {
            if (str.charAt(i + 1) == ')')
            count++;
        }else{
            rigth_max = Math.max(rigth_max, count);
            }
        }
        if (rigth_max <= left_max)
            System.out.println(rigth_max * 2);
        else
            System.out.println(left_max * 2);
    }
}