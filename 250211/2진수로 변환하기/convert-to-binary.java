/*
n값을 받음
n / 2의 값 = 몫
n % 2의 값 = 나머지

몫이 0이나 1이 아니라면 반복
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int size = 1;
        int[] arr = new int[20];
        StringBuilder sb = new StringBuilder();

        while(num > 1){
            arr[size] = num % 2;
            num = num / 2;
            size++;
        }
        arr[size] = num;

        for (int i = size; i > 0; i--){
            sb.append(arr[i]);
        }
        System.out.println(sb.toString());
    }
}
