import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] arr = new int[prices.length];
        Arrays.fill(arr, 1);
        for (int i = 0; i < prices.length - 1; i++){
            for (int j = i + 1; j < prices.length - 1; j++){
                if (prices[i] > prices[j]) {
                    break;
                }else {
                    arr[i] += 1;
                }
            }
        }
        arr[arr.length - 1] = 0;
        return arr;
    }
}