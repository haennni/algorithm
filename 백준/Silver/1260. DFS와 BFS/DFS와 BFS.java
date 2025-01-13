import java.io.*;
import java.util.*;

public class Main {

    public static void solution() throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int amount = Integer.parseInt(st.nextToken());
        int point = Integer.parseInt(st.nextToken());
        int[][] list = new int[num + 1][num + 1];
        boolean[] visited = new boolean[num + 1]; // 방문 여부 배열

        for (int i = 0; i < amount; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a][b] = 1;
            list[b][a] = 1;
        }

        System.out.println(dfs(point, num, visited, list, sb).trim());
        sb.setLength(0);
        Arrays.fill(visited, false);
        System.out.println(bfs(point, num, visited, list, sb).trim());
    }

    public static String bfs(int point, int num, boolean[] visited, int[][] list,  StringBuilder sb) {
        Queue<Integer> queue = new LinkedList<>();
        visited[point] = true;

        queue.offer(point);
        while (!queue.isEmpty()) {

            Integer poll = queue.poll();
            sb.append(poll).append(" ");

            for (int i = 1; i <= num; i++) {
                if (list[poll][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
        return sb.toString();
    }

    public static String dfs(int point, int num, boolean[] visited, int[][] list, StringBuilder sb) {
        visited[point] = true;
        sb.append(point).append(" ");

        for (int i = 1; i <= num; i++) {
            if (list[point][i] == 1 && !visited[i]) {
                dfs(i, num, visited, list, sb);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}

