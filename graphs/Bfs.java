import java.util.*;

public class Bfs {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        adj.add(Arrays.asList());
        adj.add(Arrays.asList(2,6));
        adj.add(Arrays.asList(3,4));
        adj.add(Arrays.asList());
        adj.add(Arrays.asList(5));
        adj.add(Arrays.asList());
        adj.add(Arrays.asList(7,8));
        adj.add(Arrays.asList(5));
        adj.add(Arrays.asList());
        
        int v = adj.size();
        bfs(v, adj);

        
    }

    private static void bfs(int v, List<List<Integer>> adj) {
        Queue<Integer> que = new LinkedList<>();
        int visited[] = new int[v];

        while(!que.isEmpty()) {
            
        }
    }
}