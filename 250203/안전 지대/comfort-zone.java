import java.util.*;

class Vallige{
    int x;
    int y;

    Vallige(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int[][] map;
    static int max = Integer.MIN_VALUE;
    static int safety;
    static int K;
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};

    public static String run(){
        safety = 0;
        for (int i = 1; i < max + 1; i++){
            //방문 초기화하기
            int count = 0;
            visited = new boolean[map.length][map[0].length];
            //좌표 돌기 [x]
            for (int x = 0; x < map.length; x++){
                //좌표 돌기 [y]
                for (int y = 0; y < map[0].length; y++){
                    //dfs를 통해서 count 가져오기
                    if (map[x][y] > i && !visited[x][y]){
                        //dfs에 알맞는 마을을 찾을 떄 마다 count += 1;
                        count += dfs(i, new Vallige(x, y));
                    }
                }
            }
            safety = Math.max(safety, count);
            if (safety == count) K = i;
        }
        return K + " " + safety;
    }

    public static int dfs(int num, Vallige v){
        Stack<Vallige> s = new Stack<>();
        s.push(v);

        while(!s.isEmpty()){
            Vallige vallige = s.pop();
            if (visited[vallige.x][vallige.y]) continue;
            visited[vallige.x][vallige.y] = true;

            for (int i = 0; i < 4; i++){
                int nx = vallige.x + dx[i];
                int ny = vallige.y + dy[i];
                if (canGo(nx, ny, num)){
                    s.push(new Vallige(nx, ny));
                }
            }
        }
        return 1;
    }

    public static boolean canGo(int nx, int ny, int num){
        /*1. 범위를 넘으면 false*/
        if (nx < 0 || ny < 0 || nx >= map.length || ny >= map[0].length) return false;
        /*2. k보다 작으면 false */
        if (map[nx][ny] <= num) return false;
        /*3. 이미 방문했으면 false*/
        if (visited[nx][ny]) return false;

        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        map = new int[x][y];
        for (int i = 0; i < x; i++)
            for (int j = 0; j < y; j++) {
                int num = sc.nextInt();
                map[i][j] = num;
                max = Math.max(max, num);
        }
        System.out.println(run());
    
    }
}