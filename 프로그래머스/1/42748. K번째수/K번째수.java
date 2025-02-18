import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        int count = 0;
        for (int i = 0; i < commands.length; i++){    //return 해야 할 갯수만큼 연산 수행
            int s = commands[i][0] - 1;
            int j = commands[i][1];
            int k = commands[i][2] - 1;
            int num = 0;
            int[] arr = new int[j - s]; //값을 담을 arr
            for (int f = s; f < j; f++){
                arr[num] = array[f];
                num++;
                if (f == (j - 1)){
                    Arrays.sort(arr);
                    result[count] = arr[k];
                    count++;
                    for (int n : arr){
                    }
                }
            }
        }
        return result;
    }
}