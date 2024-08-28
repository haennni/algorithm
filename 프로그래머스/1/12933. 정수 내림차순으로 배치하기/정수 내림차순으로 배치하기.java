import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str);
        
        StringBuilder sb = new StringBuilder();

        for (String s : str) {
            sb.append(s);
        }

        return Long.parseLong(sb.reverse().toString());
    }
}