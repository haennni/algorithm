import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mon = sc.nextInt();
        int day = sc.nextInt(); //23
        
        int end_mon = sc.nextInt();
        int end_day = sc.nextInt(); //30
        int result = 1;

        int[] mon_days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while(!(mon == end_mon)){
            result += mon_days[mon - 1] - day;
            mon++;
            day = 0;
        }

        if (mon == end_mon) {
            result += end_day - day;
        }
    

        System.out.println(result);
    }
}