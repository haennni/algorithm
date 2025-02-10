import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int end_day = sc.nextInt(); //12일
        int end_hour = sc.nextInt(); //12시
        int end_mins = sc.nextInt(); //04

        int day = 11;
        int hour = 11;
        int mins = 11;
        int result = 0;

        while(!(day == end_day && hour == end_hour && mins == end_mins)){
            mins++;
            result++;
        
            if (end_day < day) {
                if (end_hour < end_hour){
                    if(end_mins < mins){
                        result = -1;
                    }
                }
            }

            if(mins == 60){
                hour++;
                mins = 0;
            }

            if(hour == 24){
                day++;
                hour = 0;
            }
        }
        System.out.println(result);
    }
}