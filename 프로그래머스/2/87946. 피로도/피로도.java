import java.util.*;

class Solution {
    static boolean[] visited;
    static int max;
    static int count;
    
    public void dfs(int k, int[][] dungeons, int count){
        max = Math.max(max, count);
        
        for (int i = 0; i < dungeons.length; i++){
            // //최소 피로도가 내 피로도보다 적고, 소모 피로도가 내 피로도보다 적을 시,
            if (!visited[i] && dungeons[i][0] <= k){
                visited[i] = true;
                dfs(k - dungeons[i][1], dungeons, count + 1);
                visited[i] = false;
            }
        }
    }
    
    public int solution(int k, int[][] dungeons) {//k = 내 피로도, dungeons[0][0], 최소, [0][1]필요
        visited = new boolean[dungeons.length];
        max = 0;
        count = 0;
        Arrays.fill(visited, false);
        
        dfs(k, dungeons, 0);
        
        return max;
    }
}