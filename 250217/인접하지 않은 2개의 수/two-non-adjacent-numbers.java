import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        int max = Integer.MIN_VALUE;

        for (int i = 0 ; i < num; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < num - 2; i++){
            for (int j = i + 2; j < num; j++){
                int sum = arr[i] + arr[j];
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
}