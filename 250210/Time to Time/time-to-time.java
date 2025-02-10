import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int mins = sc.nextInt();
        int endHour = sc.nextInt();
        int endMins = sc.nextInt();
        int result = 0;

        while(!(hour == endHour && mins == endMins)){
            mins++;
            result++;

            if (mins == 60){
                mins = 0;
                hour++;
            }
        }
        System.out.println(result);
    }
}