import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void re(int n){
        if (n == 0) return;

        for (int i = 0; i < n; i++) {
            sb.append("*").append(" ");
        }
        System.out.println(sb.toString().trim());
        sb.setLength(0);

        re(n - 1);

        for (int i = 0; i < n; i++) {
            sb.append("*").append(" ");
        }
        System.out.println(sb.toString().trim());
        sb.setLength(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        re(num);
    }
}