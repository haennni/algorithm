import java.util.*;

public class Main {
    public static int sum(int num){

        if (num == 0) return num;
        if (num == 1) return num;

        //2 -> 1 + num;
        return sum(num - 1) +  sum(num - 2);


        // sum(0) -> 0
        // sum(1) -> 1
        // sum(2) -> 1 + 0
        // sum(3) -> 1 + 1
        // sum(4) -> 2 + 1
        // sum(5) -> 3 + 2
        // sum(6) -> 5 + 3
        // sum(7) -> 8 + 5
        // sum(8) -> 13 + 8 -> 21

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
}