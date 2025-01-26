import java.util.*;
import java.lang.*;

public class Main {
    public static int S(int[] num){
            int sum = 0;
            for (int i = 0; i < num.length; i++){
                if (num[i] == 1){
                    sum += (int) Math.pow(2, (num.length -1) - i);
                }
            }
            return sum;
        }

        public static int maxValue(int[] num) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < num.length; i++){
                if (num[i] == 0) {
                    num[i] = 1 - num[i];
                    int result = S(num);
                    max = Math.max(max, result);
                    num[i] = 1 - num[i];
                }
            }
            return max;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            char[] c = line.toCharArray();
            int[] arr = new int[line.length()];

            for (int i = 0; i < c.length; i++){
                arr[i] = Character.getNumericValue(c[i]);
            }
            System.out.println(maxValue(arr));
        }
    }