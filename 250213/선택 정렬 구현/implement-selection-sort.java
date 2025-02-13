import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++){
            int min = i;
            for (int j = i + 1; j < size; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
        for (int a : arr){
            System.out.print(a + " ");
        }
    }
}