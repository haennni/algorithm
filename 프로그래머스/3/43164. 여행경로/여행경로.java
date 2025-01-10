import java.util.*;

class Solution {
    public String[] solution(String[][] tickets) {
        Map<String, String> map = new HashMap<>();
        boolean[] visited = new boolean[tickets.length];
        List<String> route = new ArrayList<>();

        Arrays.sort(tickets, (a, b) -> {
            if (a[0].equals(b[0])) {
                return a[1].compareTo(b[1]);
            }
            return a[0].compareTo(b[0]);
        });


        dfs(tickets, visited, route, "ICN");

        return route.toArray(new String[0]);

    }

    private static boolean dfs(String[][] tickets, boolean[] visited, List<String> route, String depart) {
        route.add(depart);

        /* 모든 티켓을 사용한 경우*/
        if (route.size() == tickets.length + 1) {
            return true;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!visited[i] && tickets[i][0].equals(depart)) {
                visited[i] = true;
                if (dfs(tickets, visited, route, tickets[i][1]))
                    return true;
                visited[i] = false;
            }
        }

        route.remove(route.size() - 1);
        return false;
    }
}