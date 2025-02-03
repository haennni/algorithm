import java.util.*;
import java.lang.*;

public class Main {
    public static int cal(int[] arr){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++){
            int result = 0;
            for (int j = 0; j < arr.length; j++){
                result += arr[j] * Math.abs(j - i);
            }
            min = Math.min(min, result);
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(cal(arr));

    }
}

/*
기준을 정한다. 
만약에 1번째 집에서 모인다고 가정해보자.
Math.abs -> 절대값 구하는 방법
0 - 1 -> 절대값 1
1 -1  -> 절대갑 0
2 - 1 -> 절대값 1
3 - 1 -> 절대값 2
절대값을 통해서 거리를 구할 수 있다.

1. 반복문 모일 집 지정
    거리의 합계 = 0
    2. 반복문 집 마다의 거리 구하기
        합계 += Math.abs(모일 집 - 현재 집 인덱스) * arr[현재 집 인덱스]

    Math.min()를 통해서 구해놓은 min값과, 거리의 합계중 뭐가 더 작은 값인지 계산한다.
3. 반복문이 끝나면 min값을 return한다.
*/