import java.util.*;

class Main {
    static int N;
    static int M;
    static boolean[] visited;
    static int[][] node;

    public static int run(){
        return dfs(1) - 1;
    }

    public static int dfs(int start){
        int count = 1;
        visited[start] = true;

        for (int i = 1; i < N + 1; i++){
            if (node[start][i] == 1 && !visited[i]){
                visited[i] = true;
                count += dfs(i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        node = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++ ){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            node[n1][n2] = 1;
            node[n2][n1] = 1;
        }
        System.out.println(run());
    }
}