import java.util.*;

public class Main {
    public static int getDigitValue(String num, int index, int maxLen) {
        int diff = maxLen - num.length(); 
        if (index < diff) return 0;  // 자릿수가 부족하면 0을 반환
        return Character.getNumericValue(num.charAt(index - diff));  // 해당 자릿수의 값 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        String[] arr = new String[size];
        int strSize = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.next();
        }

        int maxLen = 0;
        for (String s : arr) {
            maxLen = Math.max(maxLen, s.length());
        }

        int min = 0;
        for (int i = maxLen - 1; i >= 0; i-- ){ //3번 돌음
            for (int j = 0; j < arr.length - 1; j++){//  size만큼
                min = j;
                for (int k = j + 1; k < arr.length; k++){
                    int num1 = getDigitValue(arr[min], i, maxLen); //가장 작은 값, 현재 인덱스, 가장 큰 값
                    int num2 = getDigitValue(arr[k], i, maxLen);
                    if (num1 > num2) {
                        min = k;
                    }
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