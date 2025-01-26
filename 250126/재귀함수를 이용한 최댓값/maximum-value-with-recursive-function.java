import java.util.*;
import java.lang.*;

class Main {
    public static int F(int n, int[] arr){
        if (n <= 1) return arr[0];
    
        
        int max = arr[n - 1];

        return Math.max(max, F(n - 1, arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];
        for(int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(F(num, arr));
    }
}
/* 

원소의 범위를 입력받음 
원소의 범위만큼 숫자를 입력받음

재귀 함수를 만들음
1. 종료조건을 만듦 
if (n <= 1)이라면 무조건 return arr[n]을 리턴함

2. 만약에 1을 넘는다면 수행해야 할 조건은
return Math.max(max, F(n - 1))

*/