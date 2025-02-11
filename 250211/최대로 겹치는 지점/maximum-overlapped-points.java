import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[101];

        for(int i = 0; i < size; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            for(int j = num1; j < num2 + 1; j++){
                arr[j] += 1;
            }
        }

        int max = Integer.MIN_VALUE;

        for(int m : arr){
            max = Math.max(m, max);
        }
        System.out.println(max);
    }
}