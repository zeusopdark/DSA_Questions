class Solution {
        ArrayList<ArrayList<Integer>>graph;
    public int findCircleNum(int[][] isConnected) {
        graph=new ArrayList<>();
        
        for(int i=0;i<isConnected.length;i++){
            graph.add(new ArrayList<>());
        }
        
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(isConnected[i][j]==1&&i!=j){
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
        
        int [] visited=new int[isConnected.length];
        int p=0;
        for(int i=0;i<visited.length;i++){
            if(visited[i]==0){
                p+=1;
                helper(i,visited);
            }
        }
        return p;
    }
    
    public void helper(int node,int[]visited){
        visited[node]=1;
        for(int i:graph.get(node)){
            if(visited[i]==0){
                helper(i,visited);
            }
        }
    }
}
