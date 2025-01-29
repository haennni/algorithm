import java.util.*;
import java.lang.*;

public class Main {
    public static final int MAX_NUM = 10000; 
    public static int n, k;
    public static int[] arr = new int[MAX_NUM + 1];

    public static int cal(){
        int maxSum = 0;
        for (int i = 0; i <= MAX_NUM - k; i++){
            int sum = 0;
            for (int j = i; j < i + k; j++){
                sum += arr[j];
            }
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt(); 

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            char c = sc.next().charAt(0);

            if (c == 'H'){
                arr[x] = 1;
            }else{
                arr[x] = 2;
            }
        }
        System.out.println(cal());
    }
    
}