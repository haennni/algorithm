import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (String p : participant)
            map.put(p, map.getOrDefault(p, 0) + 1);
        for (String c : completion) {
            Integer integer = map.get(c);
            if (integer == 1) {
                map.remove(c);
            }else {
                map.put(c, map.get(c) - 1);
            }
        }
        Set<String> strings = map.keySet();
        return strings.iterator().next();
    }
}