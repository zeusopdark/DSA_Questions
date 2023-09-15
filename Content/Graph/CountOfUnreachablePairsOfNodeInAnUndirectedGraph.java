class Solution {
         List<List<Integer>>list;
         boolean[]visited;
    public long countPairs(int n, int[][] edges) {
        visited=new boolean[n];
        list=new ArrayList<>();
            
            for(int i=0;i<n;i++){
                    list.add(new ArrayList<>());
            }
            
            for(int i[]:edges){
                    list.get(i[0]).add(i[1]);
                    list.get(i[1]).add(i[0]);
            }
            long count=0L;
            for(int i=0;i<n;i++){
                    if(!visited[i]){
                            long findConnected=helper(i);
                            //once we find the number of connected components we can find out number of not connected components by subtracting it with n after getting the number of non-connected nodes we can mulply it by no of connected nodes to get the number of pairs.
                            // System.out.println(findConnected);
                            count=count+(long)((long)(n-findConnected)*findConnected); 
                    }
            }
            return count/2;
    }
        
        public long helper(int node){
            Queue<Integer>q=new LinkedList<>();
                q.offer(node);
                
                int count=0;
                while(!q.isEmpty()){
                        int v=q.poll();
                        visited[v]=true;
                        count+=1;
                        for(int i:list.get(v)){
                                if(!visited[i]){
                                        visited[i]=true;
                                        q.offer(i);
                                }
                        }
                }
                return (long)count;
        }
}
