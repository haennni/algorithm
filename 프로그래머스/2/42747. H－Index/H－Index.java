import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Integer[] array = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(array, Collections.reverseOrder());
        int h_index = 0;

        for (int i = 1; i < array.length + 1; i++) {
            int count = array[i - 1];
            int min = Math.min(i, count);
            h_index = Math.max(min, h_index);
        }
        return h_index;
    }
}