class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[((num_list.length - 1) / n) + 1];
        int count = 0;

        for (int i = 0; i < num_list.length; i++){
            if (i == 0 || i % n == 0) {
                answer[count] = num_list[i];
                count++;
            }
        }
        return answer;
    }
}