import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int end_day = sc.nextInt(); //12일
        int end_hour = sc.nextInt(); //24시
        int end_mins = sc.nextInt(); //04

        int day = 11;
        int hour = 11;
        int mins = 11;

        int result = ((end_day * 24 * 60) + (end_hour * 60) + (end_mins)) - ((day * 24 * 60) + (hour * 60) + mins);

        if (result < 0){
            System.out.println(-1);
        }else{
            System.out.println(result);
        }
    }
}
