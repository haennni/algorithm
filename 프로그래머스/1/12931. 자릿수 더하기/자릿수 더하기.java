import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String result = String.valueOf(n);
        String[] split = result.split("");

        for(String s : split){
            answer += Integer.parseInt(s);
        }

        return answer;
    }
}