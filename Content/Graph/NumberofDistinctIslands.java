class Solution {
String ans="";
  Set<String>set;
 int[][]dir={{-1,0},{0,1},{0,-1},{1,0}};
 int count=0;
    int countDistinctIslands(int[][] grid) {
         set=new HashSet<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    helper(grid,i,j,i,j);
                    // System.out.println(ans);
                    if(!ans.isEmpty()&&!set.contains(ans)){
                        set.add(ans);
                        count+=1;
                      
                    }
                      ans="";
                }
            }
        }
        return set.size();
    }
    
    public void helper(int[][]grid,int i,int j, int base1,int base2){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==2||grid[i][j]==0)return;
        
        grid[i][j]=2;
        ans+=(base1-i)+" "+(base2-j);
        for(int p[]:dir){
            int nrow=p[0]+i;
            int ncol=p[1]+j;
            
            helper(grid,nrow,ncol,base1,base2);
        }
    }
}
