import java.util.*;
public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void recursion(int num){
        if (num == 0) return;
        String str = "*";

        recursion(num - 1);
        for (int i = 0; i < num; i++) sb.append("*");
        System.out.println(sb.toString());
        sb.setLength(0);
    
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        recursion(num);
    
    }
}