import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lange = sc.nextInt();
        int size = sc.nextInt();
        int[] arr = new int[lange + 1];
        Arrays.fill(arr, 0);

        for (int i = 0; i < size; i++){
            int num2 = sc.nextInt();
            int num1 = sc.nextInt();
            for (int j = num2; j < num1 + 1; j++){
                arr[j] += 1;
            }
        }

        int max = Integer.MIN_VALUE;

        for (int m : arr){
            max = Math.max(max, m);
        }
        System.out.println(max);
    }
}