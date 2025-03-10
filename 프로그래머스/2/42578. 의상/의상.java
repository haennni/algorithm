import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++)
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 1) + 1);
        
        for (String name : map.keySet())
            answer *= map.get(name);
        
        return answer - 1;
    }
}