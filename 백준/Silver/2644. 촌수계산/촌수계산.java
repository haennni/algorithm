import java.util.*;

public class Main{
    static List<Integer>[] graph;
    static boolean[] visited;
    
    public static int bfs(int start, int target){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{start, 0});
        while(!q.isEmpty()){
            int[] g = q.poll();
            
            if (g[0] == target) return g[1]; 
            
            for (int t : graph[g[0]]){
                if (!visited[t]){
                    visited[t] = true;
                    q.offer(new int[]{t,g[1] + 1});
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); /*사람 수*/
        int p = sc.nextInt();
        int p2 = sc.nextInt();
        int num = sc.nextInt();
        
        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];
       
        for (int i = 1; i <= n; i++) graph[i] = new ArrayList<>();

        
        for (int i = 0; i < num; i++){
            int o = sc.nextInt();
            int t = sc.nextInt();
            graph[o].add(t);
            graph[t].add(o);
        }
        System.out.println(bfs(p, p2));
    }
}