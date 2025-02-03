import java.util.*;
import java.lang.*;

public class Main {
    public static int cal(int[] arr, int num, int count){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < num - count + 1; i++){
            int sum = 0;
            for (int j = 0; j < count; j++){
                sum += arr[i + j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = scanner.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) arr[i] = scanner.nextInt();

        System.out.println(cal(arr, num, count));
    }
}

/*
6개의 숫자가 주어짐
1. 0 ~ 3번째 인덱스에서 max 값 찾음
2. 1 ~ 4번째 인덱스에서 max 값 찾음
3. 2 ~ 5번째 인덱스에서 max 값 찾음

4. 각 max값을 찾을 때 마다 각 max중에 어떤 것이 min값인지 확인하기
*/