import java.util.*;

public class Main {
    public static int sum(int num){
        if (num == 1) return 0;

        boolean b = (num % 2 == 0);
        if (num % 2 == 0) 
        return sum(num / 2) + 1;

        return sum(num / 3) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
}