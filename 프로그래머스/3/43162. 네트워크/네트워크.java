import java.util.*;

class Solution {
public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            answer++;
            connection(i, n, computers, visited);
        }
        return answer;
    }

    void connection(int i, int n, int[][] computers, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(i);
        while (!stack.isEmpty()) {
            int computer = stack.pop();
            visited[computer] = true;
            for (int k = 0; k < computers[computer].length; k++) {
                if (visited[k]) continue;
                if (computers[computer][k] == 1) {
                    stack.push(k);
                }
            }

        }
    }
}