import java.util.*;

public class Main {
    public static int solution() {
        Scanner sc = new Scanner(System.in);
        int computerCount = sc.nextInt();
        int network = sc.nextInt();
        sc.nextLine();
        int[][] computer = new int[network][2];
        boolean[] visited = new boolean[computerCount + 1];
        HashSet<Integer> count = new HashSet<>();

        for (int i = 0; i < network; i++) {
            String string = sc.nextLine();
            String[] split = string.split(" ");
            computer[i][0] = Integer.parseInt(split[0]);
            computer[i][1] = Integer.parseInt(split[1]);
        }
        count.add(1);
        int dfs = dfs(1, computer, visited, network);
        return dfs - 1;

    }

    public static int dfs(int currentComputer, int[][] computer, boolean[] visited, int network) {
        visited[currentComputer] = true;
        int count = 1;

        for (int i = 0; i < network; i++) {
            if (computer[i][0] == currentComputer && !visited[computer[i][1]]) {
                visited[computer[i][1]] = true;
                count += dfs(computer[i][1], computer, visited, network);

            } else if (computer[i][1] == currentComputer && !visited[computer[i][0]]) {
                visited[computer[i][0]] = true;
                count += dfs(computer[i][0], computer, visited, network);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution());
    }
}