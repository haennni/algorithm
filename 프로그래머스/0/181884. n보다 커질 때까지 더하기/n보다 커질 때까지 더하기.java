class Solution {
    public int solution(int[] numbers, int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += numbers[i];
            if (result > n) {
                return result;
            }
        }
        return result;
    }
}