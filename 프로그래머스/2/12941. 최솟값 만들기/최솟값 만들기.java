import java.util.*;

public class Solution {
    public static int solution(int[] a, int[] b) {
        int result = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        int[] reverseB = reverse(b);

        for (int i = 0; i < a.length; i++){
            result += a[i] * reverseB[i];}
        return result;
    }

    public static int[] reverse(int[] list) {
        for (int i = 0; i < list.length / 2; i++) {
            int temp = list[i];
            list[i] = list[list.length - i - 1];
            list[list.length - 1 - i] = temp;}
        return list;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2};
        int[] b = new int[]{3, 4};
        System.out.println(solution(a, b));
    }
}