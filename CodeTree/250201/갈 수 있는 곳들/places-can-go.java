/*
1. 상하좌우로 움직일 수 있다
2. 숫자 0은 이동 가능! 숫자 1은 이동 불가능!
3. 시작점 두 곳을 받아서 queue에 넣고, 
4. 방문처리 해야하고
5. 만약에 상하좌우의 값이 0이면 count를 늘리고, visitei
*/

import java.util.*;

class Position{
    int y;
    int x;
    int count;

    Position(int y, int x, int count){
        this.y = y;
        this.x = x;
        this.count = count;
    }

}

class Main {
    static boolean[][] visited;
    static int[][] map;
    static int[][] r;
    static Queue<Position> q;
    static int[] dx;
    static int[] dy;
    static int result = 0;

    public static int run(){
        while(!q.isEmpty()){
            Position position = q.poll();
            for (int i = 0; i < 4; i++){
                int ny = position.y + dy[i];
                int nx = position.x + dx[i];
                if (canGo(ny, nx)){
                    visited[ny][nx] = true;
                    result ++;
                    q.offer(new Position(ny, nx, position.count + 1));
                }
            }
        }
        return result;
    }

    public static boolean canGo(int ny, int nx){
        /* 범위를 넘어가는지 확인 */
        if (nx < 0 || ny < 0 || nx >= map[0].length || ny >= map.length )return false;
        /* 방문 한 곳인지 확인*/
        if (visited[ny][nx]) return false;
        /* 이동할 수 없는 위치인지 확인*/
        if (map[ny][nx] == 1) return false;

        return true;

    }

    public static void main(String[] args) {
        q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int mapSize = sc.nextInt(); 
        int rSize = sc.nextInt();

        map = new int[mapSize][mapSize];
        visited = new boolean[mapSize][mapSize];

        for (int i = 0; i < mapSize; i++){
            for (int j = 0; j < mapSize; j++)
                map[i][j] = sc.nextInt();
        }

        dx = new int[]{0, 0, 1, -1};
        dy = new int[]{-1, 1, 0, 0};

        for (int i = 0; i < rSize; i++){
            int y = sc.nextInt();
            int x = sc.nextInt();
            visited[y - 1][x - 1] = true;
            q.offer(new Position(y - 1, x - 1, 1));
            result ++;
        }

        System.out.println(run());
    }
}