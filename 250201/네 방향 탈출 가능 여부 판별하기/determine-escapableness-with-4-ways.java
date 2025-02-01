import java.util.*;

class Position{
    int x;
    int y;

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

    public static int run(int[][] map){
        dx = new int[]{0, 1, 0, -1};
        dy = new int[]{-1, 0, 1, 0};

        Queue<Position> queue = new LinkedList<>();
        queue.offer(new Position(0, 0));
        visited[0][0] = true;

        while(!queue.isEmpty()){
            Position position = queue.poll();

            if (position.y == map.length - 1 && position.x == map[0].length - 1) return 1;

            for (int i = 0; i < 4; i++){
                if (canGo(position, i)) queue.offer(new Position(position.y + dy[i],position.x + dx[i]));
            }
        }
        return 0;
    }

    public static boolean canGo(Position position, int num){
        if (position.y + dy[num] < map.length && position.x + dx[num] < map[0].length &&
            position.x + dx[num] >= 0 && position.y + dy[num] >= 0){
            if (isVisited(position.y + dy[num], position.x + dx[num])){
                return map[position.y + dy[num]][position.x + dx[num]] == 1;
            }
        }
        return false;
    }

    public static boolean isVisited(int y, int x){
        if (visited[y][x]){
            return false;
        }else{
            visited[y][x] = true;
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
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