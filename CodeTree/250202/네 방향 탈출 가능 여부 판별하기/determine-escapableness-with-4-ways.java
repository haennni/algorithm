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
    static int[][] map;
    static int[] dx;
    static int[] dy;
    static boolean[][] visited;

    public static int run(int[][] map) {
        dx = new int[]{0, 1, 0, -1};
        dy = new int[]{-1, 0, 1, 0};
        if (map[0][0] == 0 || map[map.length - 1][map[0].length - 1] == 0) return 0;

        Queue<Position> queue = new LinkedList<>();
        queue.offer(new Position(0, 0));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Position position = queue.poll();

            if (position.y == map.length - 1 && position.x == map[0].length - 1) return 1;

            for (int i = 0; i < 4; i++) {
                int ny = position.y + dy[i];
                int nx = position.x + dx[i];
                if (canGo(ny, nx)) {
                    visited[ny][nx] = true;
                    queue.offer(new Position(ny, nx));

                }

            }
        }
        return 0;
    }


    public static boolean canGo(int ny, int nx){
        /*범위 검사*/
        if (ny >= map.length || nx >= map[0].length || ny < 0 || nx < 0) return false;
        /*방문 검사*/
        if (visited[ny][nx])  return false;
        /*뱀이 있는지 확인*/
        if (map[ny][nx] == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int x = sc.nextInt();
        map = new int[y][x];
        visited = new boolean[y][x];
        for (int i = 0; i < y; i++){
            for (int j = 0; j < x; j++){
                map[i][j] = sc.nextInt();
            }
        }
        System.out.println(run(map));
    }
}
