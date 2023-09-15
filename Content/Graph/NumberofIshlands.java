class Solution {
    int dir[][]={{1,0},{-1,0},{0,1},{0,-1}};
    int count=0;
    public int numIslands(char[][] grid) {
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    helper(grid,i,j);
                    count++;
                }
            }
        }
        return count;
      
    }
    public void helper(char[][]grid,int row,int col){
        Queue<Pair>q=new LinkedList<>();
        q.offer(new Pair(row,col));
        
        grid[row][col]='2';
        
        while(!q.isEmpty()){
            int i=q.peek().first;
            int j=q.peek().second;
            
            q.poll();
            
            for(int p[]:dir){
                int nrow=i+p[0];
                int ncol=j+p[1];
                
                if(nrow>=0&&ncol>=0&&nrow<grid.length&&ncol<grid[0].length&&grid[nrow][ncol]=='1'){
                    grid[nrow][ncol]='2';
                    q.offer(new Pair(nrow,ncol));
                }
            }
        }
    }
}
class Pair{
    int first,second;
    public Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
