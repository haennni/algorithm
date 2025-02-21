//System.out.println();

import java.util.*;

class Solution {
    static ArrayList<ArrayList<Integer>> wire;
    static boolean[] visited;
    
    public int dfs(int target, int count){
        visited[target] = true;
        ArrayList<Integer> list = wire.get(target);
        
        for (int i = 0; i < list.size(); i++){
            int num = list.get(i);
            if (!visited[num]){
                // System.out.println("[tartget]" + target + "   [visit] 방문 시작" + num);
                visited[num] = true;
                count += dfs(num, 1);
            }
        }
        return count;
    }
    
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        wire = new ArrayList<>();
        
        for (int i = 0; i < n + 1; i++){
            wire.add(new ArrayList<Integer>());
        }
        
        for (int i = 0; i < wires.length; i++){
            int num1 = wires[i][0];
            int num2 = wires[i][1];
            wire.get(num1).add(num2);
            wire.get(num2).add(num1);
        }
        
        
        for (int i = 0; i < wires.length; i++){
            // 양방향 연결을 끊음
            int start = wires[i][0];
            int end = wires[i][1];
            
            visited = new boolean[n + 1];
            
            wire.get(start).remove(Integer.valueOf(end));
            wire.get(end).remove(Integer.valueOf(start));
            
            //System.out.println("[start]: " + start + "[end]" + end);
            int count1 = dfs(start, 1);
            int count2 = dfs(end, 1);

            answer = Math.min(answer, Math.abs(count1 - count2));    
            /*다음 연산을 위해 다시 양방향 연결*/
            wire.get(start).add(end);
            wire.get(end).add(start);
            
        }
        
        return answer;
    }
    
}