import java.util.*;

public class Main {
    public static int cal(int[][] arr, int count){
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++){
            if (i + 1 == count){
                int num = Math.abs(arr[i][0] - arr[i + 2][0]);
                int num2 = Math.abs(arr[i][1] - arr[i + 2][1]);
                sum += num + num2;
            }else if (i != count){
                int num = Math.abs(arr[i][0] - arr[i + 1][0]);
                int num2 = Math.abs(arr[i][1] - arr[i + 1][1]);
                sum += num + num2;
            }
        }
        return sum;
    }

    public static int maxValue(int[][] arr){
        int min = Integer.MAX_VALUE;
        int count = 1; // 첫 번째 거리는 뛰어넘을 수 없고, 마지막 거리도 뛰어넘을 수 없다
        
        for (int i = 0; i < arr.length - 2; i++){
            int result = cal(arr, count);
            count++;

            min = Math.min(min, result);
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); //거리
        int[][] arr = new int[N][2]; //좌표

        for (int i = 0; i < N; i++){
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }

        System.out.println(maxValue(arr));
    }
}