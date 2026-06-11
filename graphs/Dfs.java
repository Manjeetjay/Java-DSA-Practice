import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dfs {
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
        int vis[] = new int[v+1];
        for(int i = 1; i <= v; i++) {
            if(vis[i] == 0) {
                vis[i] = 1;
                dfs(adj, i);
            }
        }
    }

    
    private static void dfs(List<List<Integer>> adj, int i) {
        System.out.println();
        
    }

}
