import java.util.*;
public class Main {
    static int[] arr = new int[20];
    static int size = 0;

    /*2진수*/
    public static int binary(String str){

        int result = 0;
        size = str.length();
        for (int i = 0; i < size; i++){
            arr[i] = Character.getNumericValue(str.charAt(i));
        }

        for (int i = 0; i < size; i++){
            result = result * 2 + arr[i];
        }
        return result;
    }

    public static void decimal(int num){
        StringBuilder sb = new StringBuilder();
        int result = num * 17;
        int n = 0;
        int[] binaryArr = new int[20];

        while(result > 1){
            binaryArr[n] = result % 2;
            result = result / 2;
            n++;
        }
        binaryArr[n] = result;

        for (int i = n; i > -1; i--){
            arr[size] = binaryArr[i];
            size++;
            sb.append(binaryArr[i]);
        }
        System.out.println(sb.toString());

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int binary = binary(str);
        decimal(binary);
    }
}