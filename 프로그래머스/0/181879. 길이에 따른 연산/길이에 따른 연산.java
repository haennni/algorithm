class Solution {
    public static int solution(int[] num_list) {
        int length = num_list.length; //4
        int result = 0;

        if (length >= 11) {
            for (int num : num_list) {
                result += num;
            }
        } else {
            result = 1;
            for (int num : num_list) {
                result *= num;
            }
        }
        return result;
    }
}