import java.util.*;

public class Main {
    public static int sum(int num){
        //num이 1527일 경우 -> 이걸 152로 만들 방법은?
        if (num < 10) return num * num; // 6 * 6 반환 
        //65
        int digit = num % 10; //5
        return sum(num / 10) + digit * digit;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        System.out.println(sum(num));

    }
}