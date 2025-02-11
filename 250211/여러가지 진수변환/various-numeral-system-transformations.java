
/*
int num = 값을 받음 (111)
while(num > 4) 반복
몫 num / 4 값을 num에 저장한 뒤
나머지 num % 4 값을 int 배열에 저장한다.
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[20];
        int size = 0;

        while(num >= n){
            arr[size] = num % n;
            num = num / n;
            size++;
        }

        arr[size] = num;

        for (int i = size; i > -1; i--){
            sb.append(arr[i]);
        }

        System.out.println(sb.toString());


    }
}