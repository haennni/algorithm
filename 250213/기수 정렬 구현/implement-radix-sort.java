import java.util.*;
/*
123
234
567
890


int a = 1
int size = str.length();

for (int i = size; i < 0; i- ){ //3번 돌음

    for (int j = 0; ㅓ < size; i++) //  size만큼
        int min = j
        for (int k = j + 1; j > 0; j--){
            if (arr[min] > int[k])
            min = k;
        }
        int temp = int[i];
        int[i] = arr[min];
        arr[min] = temp;

}
*/


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        String[] arr = new String[size];

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.next();
        }

        int strSize = arr[0].length();

        int min = 0;

        for (int i = strSize; i > 0; i-- ){ //3번 돌음
            for (int j = 0; j < arr.length - 1; j++){//  size만큼
                min = j;
                for (int k = j + 1; k < arr.length; k++){
                    if (Character.getNumericValue(arr[min].charAt(i - 1)) > Character.getNumericValue(arr[k].charAt(i - 1)))
                    min = k;
                }
                String temp = arr[j];
                arr[j] = arr[min];
                arr[min] = temp;
            }
        }

        for (String s : arr){
            System.out.print(s + " ");
        }
    }
}