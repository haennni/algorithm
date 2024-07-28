class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            }else if (arr[i] < 50 && !(arr[i] % 2 == 0)){
                arr[i] = arr[i] * 2;
            }
        }

        return arr;
    }
}