import java.util.*;

class Solution {
    static int[] nx = {0, 1, 0, -1};
    static int[] ny = {-1, 0, 1, 0};
    static String[][] map;
    static boolean[][] visited;
    static int max = Integer.MIN_VALUE;
    //Arrays.fill(visited, false);
    public int dfs(int x, int y, int count){
        
        /*상하좌우 비교*/
        for (int i = 0; i < 4; i++ ){
            int newX = x + nx[i];
            int newY = y + ny[i];
            /*범위 확인*/
            if (isGo(newX, newY)){
                //System.out.println("[다음 칸으로 이동]" + "[현재 X]:" + x + "[현재 Y]:" + y);
                visited[newX][newY] = true;
                count += dfs(newX, newY, Integer.parseInt(map[newX][newY]));
            }
        }
        return count;
    }
    
    public boolean isGo(int newX, int newY){
        /*범위 체크*/
        if (newX >= map.length || newY >= map[0].length || newX < 0 || newY < 0) return false;
        /*이미 방문한 곳*/
        if (visited[newX][newY]) return false;
        if (map[newX][newY].equals("X")) return false;
        
        return true;
    }
    
    public int[] solution(String[] maps) {
        int[] answer = {};
        map = new String[maps.length][maps[0].length()];
        List<Integer> list = new ArrayList<>();
        /*map 만듦*/
        for (int i = 0; i < maps.length; i++){
            map[i] = maps[i].split("");
        }
        
        /*각 지점 비교*/
        visited = new boolean[maps.length][maps[0].length()];
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map[0].length; j++){
                if (!map[i][j].equals("X") && !visited[i][j]){
                    visited[i][j] = true;
                    int count = dfs(i, j, Integer.parseInt(map[i][j]));
                    if (count != 0) list.add(count);
                }
            }
        }
        if (list.isEmpty()){
            list.add(-1);
        }else{
            Collections.sort(list);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}