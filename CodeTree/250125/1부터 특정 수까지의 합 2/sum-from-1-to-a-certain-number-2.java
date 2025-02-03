import java.util.*;

public class Main {

    public static int fac(int n){
        if (n == 1) return 1;

        return fac(n - 1) + n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(fac(i));
    }
}