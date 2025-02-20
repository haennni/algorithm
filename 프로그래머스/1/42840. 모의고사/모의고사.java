import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();
        int max = 0;
        int[] score = new int[3];
        int[] s1 = new int[]{1, 2, 3, 4, 5};
        int[] s2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] s3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for (int i = 0; i < answers.length; i++){
            if (answers[i] == s1[i % s1.length]) score[0]++;
            if (answers[i] == s2[i % s2.length]) score[1]++;
            if (answers[i] == s3[i % s3.length]) score[2]++;
        }
        
        max = Math.max(score[0], Math.max(score[1], score[2]));
        System.out.println(max);
                       
        for (int i = 0; i < 3; i++){
            if (score[i] == max){
                list.add(i + 1);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}