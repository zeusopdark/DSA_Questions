class Solution {
    ArrayList<Integer> ans = new ArrayList<>();
    boolean[] visited;
    
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        visited = new boolean[V];
        
        bfs(0,adj);
        
        return ans;
    }
    
    public void bfs(int node, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(node);
        visited[node] = true;
        
        while (!q.isEmpty()) {
            int p = q.poll();
            ans.add(p);
            
            for (int i : adj.get(p)) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
    }
}
