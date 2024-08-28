class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];

        StringBuilder sb = new StringBuilder(s);
        String[] split = sb.reverse().toString().split("");

        for (int i = 0; i < s.length(); i++) {
            answer[i] = Integer.parseInt(split[i]);
        }

        return answer;
    }
}