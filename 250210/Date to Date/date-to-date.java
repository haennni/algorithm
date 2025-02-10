import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mon = sc.nextInt();
        int day = sc.nextInt();
        
        int end_mon = sc.nextInt();
        int end_day = sc.nextInt();
        int result = 1;

        int[] mon_days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while(!(mon == end_mon)){
            result += mon_days[mon - 1] - day;
            mon++;
            day = 0;
        }

        result += end_day;

        System.out.println(result);
    }
}