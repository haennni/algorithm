import java.util.*;
class Solution {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, +1, 0};
    static boolean[][] visited;
    static int[] answer;
    
    
    public static void dfs(int line, int x, int y, int count, String[] place){
        if (count > 2) return;
        if (count > 0 && count <= 2 && place[x].charAt(y) == 'P'){
            answer[line] = 0;
            return;
        }
        for (int i = 0; i < 4; i++){
            int newX = x + dx[i];
            int newY = y + dy[i];
            
            if (newX >= 0 && newX < 5 && newY >= 0 && newY < 5 && 
                place[newX].charAt(newY) != 'X'){
                if (visited[newX][newY]) continue;
                visited[newX][newY] = true;
                dfs(line, newX, newY, count + 1, place);
                visited[newX][newY] = false;
            }
        }
    }
    
    public static int[] solution(String[][] places) {
        answer = new int[places.length];
        Arrays.fill(answer, 1);
        
        for (int i = 0; i < places.length; i++){
            String[] place = places[i];
            visited = new boolean[5][5];
            
            for (int j = 0; j < place.length; j++){
                for (int m = 0; m < place.length; m++){
                    if (place[j].charAt(m) == 'P'){
                        visited[j][m] = true;
                        dfs(i, j, m, 0, place);
                    }
                }
            }
        }
        return answer;
    }
}