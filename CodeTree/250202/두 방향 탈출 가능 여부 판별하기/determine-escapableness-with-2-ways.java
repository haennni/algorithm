import java.util.*;

class Position{
    int y;
    int x;
    
    Position(int y, int x){
        this.y = y;
        this.x = x;
    }
}

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = new int[]{0, 1};
    static int[] dy = new int[]{1, 0};

    public static int run(){
        visited[0][0] = true;
        return dfs(new Position(0, 0));
    }

    public static int dfs(Position position){
        if (position.x == map[0].length - 1 && position.y == map.length -1) {
            return 1;
        }

        for (int i = 0; i < 2; i++){
            int ny = position.y + dy[i];
            int nx = position.x + dx[i];
            if (canGo(ny, nx)){
                if (isVisited(ny, nx)){
                    visited[ny][nx] = true;
                    if (dfs(new Position(ny, nx)) == 1) {
                        return 1;
                    }
                }
            }
            
        }
        return 0;
    }

    public static boolean canGo(int ny, int nx){
        /* 범위 */
        if (nx < 0 || ny < 0 || nx >= map[0].length || ny >= map.length) return false;

        /* 0인 곳은 못감 */
        if (map[ny][nx] == 0) return false;

        return true;
    }

    public static boolean isVisited(int ny, int nx){
        if (!visited[ny][nx])return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int x = sc.nextInt();
        map = new int[y][x];
        visited = new boolean[y][x];

        for (int i = 0; i < y; i++){
            for( int j = 0; j < x; j++){
                int num = sc.nextInt();
                map[i][j] = num;
            }
        }

        System.out.println(run());
    }
}
