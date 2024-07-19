class Solution {
    public int solution(String num_str) {
        int answer = 0;

        String[] num = num_str.split("");
        
        for (int i = 0; i < num.length; i++){
            answer += Integer.valueOf(num[i]);
        }
        return answer;
    }
}