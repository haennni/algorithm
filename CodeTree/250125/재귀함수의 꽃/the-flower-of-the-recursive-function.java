import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void re(int n){
        if (n == 0) return;

        sb.append(n).append(" ");
        re(n - 1);
        sb.append(n).append(" ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        re(num);

        System.out.println(sb.toString().trim());
    }
}