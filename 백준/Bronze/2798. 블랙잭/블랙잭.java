import java.util.*;

public class Main{
 public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int card_count = sc.nextInt();
        int num_count = sc.nextInt();
        int num = 0;
        int[] arr = new int[card_count];
        /* 카드 저장 */
        for (int i = 0; i < card_count; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < card_count - 2; i++){
            for(int j = i + 1; j < card_count - 1; j++){
                for (int k = j + 1; k < card_count; k++){
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum <= num_count){
                        num = Math.max(num, sum);
                    }
                }
            }
        }
        System.out.println(num);
    }
}