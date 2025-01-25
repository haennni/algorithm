import java.util.*;

public class Main {
    public static int F(int n){
        if (n <= 1) return n;

        return F(n - 2) + n;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(F(num));
    }


}