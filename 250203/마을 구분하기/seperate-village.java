/*각 행에 사람이 있는 경우 1, 벽이 있는 경우 0 */
/*첫 번째 줄에는 총 마을의 갯수*/
/*두 번째 줄에는 총 마을의 갯수 -> 오름차순으로*/
import java.util.*;

class Position{
    int y;
    int x;

    Position(int y, int x){
        this.y = y;
        this.x = x;
    }
}


class Main {
    static int[] dx;
    static int[] dy;
    static int[][] map;
    static boolean[][] visited;
    static List<Integer> result;

    public static void run(){
        dx = new int[]{0, 1, 0, -1};
        dy = new int[]{-1, 0, 1, 0};
        result = new ArrayList<>();

        for (int y = 0; y < map.length; y++){
            for(int x = 0; x < map.length; x++){
                if (!visited[y][x] && map[y][x] == 1){
                    result.add(dfs(new Position(y, x), 0));
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (int s : result) {
            System.out.println(s);
        }
    }

    public static int dfs(Position p, int count){
        Stack<Position> s = new Stack<>();

        s.push(p);

        while(!s.isEmpty()){
            Position position = s.pop();
            if (visited[position.y][position.x]) continue;

            visited[position.y][position.x] = true;
            count++;

            for (int i = 0; i < 4; i++){
                int nx = position.x + dx[i];
                int ny = position.y + dy[i];
                if (canGo(ny, nx)){
                    s.push(new Position(ny, nx));
                }
            }
        }
        return count;

    }
    public static boolean canGo(int ny, int nx){
        //1. 범위에서 안벗어나는가?
        if (nx < 0 || ny < 0 || nx >= map.length || ny >= map.length) return false;
        //2. 마을이 있는가?
        if (map[ny][nx] == 0) return false;
        //3. 방문하지 않은 곳 인가?
        return !visited[ny][nx];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        map = new int[num][num];
        visited = new boolean[num][num];

        for (int i = 0; i < num; i++){
            for (int j = 0; j < num; j++) map[i][j] = sc.nextInt();
        }
        run();
    }
}
