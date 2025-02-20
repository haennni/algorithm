import java.util.*;

class Solution {
    public String solution(
        String[] participant, 
        String[] completion) {
        // participant = 참여자
        // completion = 완주자
        StringBuilder sb = new StringBuilder();

        HashMap<String, Integer> user = new HashMap<>();

        for (String p : participant){
            user.put(p, user.getOrDefault(p, 0) + 1);
        }

        for (String c : completion){
            int f = user.get(c);
            if (f == 1){
                user.remove(c); 
            }else {
                user.put(c, f - 1);
            }
        }
        
        Iterator<String> iterator = user.keySet().iterator();
        
        while(iterator.hasNext()){
           return iterator.next();
        }
        return "";
    }
}