import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
    
        for (int i = 0; i < str.length() - 1; i++){
            if (str.charAt(i) == '(' && str.charAt(i + 1) == '(') {
                for (int j = 0; j < str.length() - 1; j++){
                    if (str.charAt(j) == ')' && str.charAt(j + 1) == ')')
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}