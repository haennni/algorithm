class Solution {
    public int[] solution(int[] arr) {

        int count = 0;
        int length = 0;
        for (int a : arr) {
            length += a;
        }

        int[] answer = new int[length];

        for (int i=0; i < arr.length; i++){
            int num = arr[i];
            for (int k = 0; k < num; k++) {
                answer[count] += num;
                count += 1;
            }
        }
        return answer;
    }
}