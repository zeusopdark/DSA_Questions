class Solution {
        int[][]dir={{1,0},{0,1},{0,-1},{-1,0}};
    public int[][] updateMatrix(int[][] mat) {
            Queue<Pair>q=new LinkedList<>();
            
            for(int i=0;i<mat.length;i++){
                    for(int j=0;j<mat[0].length;j++){
                            if(mat[i][j]==0){
                                    q.offer(new Pair(i,j));
                            }
                            else{
                                    mat[i][j]=-1;
                            }
                    }
            }
               

                while(!q.isEmpty()){
                        int nrow=q.peek().first;
                        int ncol=q.peek().second;
                        q.poll();
                        
                        for(int i[]:dir){
                                int m=nrow+i[0];
                                int n=ncol+i[1];
                                
                                if(m>=0&&n>=0&&m<mat.length&&n<mat[0].length&&mat[m][n]==-1){
                                        mat[m][n]=mat[nrow][ncol]+1;
                                        q.offer(new Pair(m,n));
                                }
                        }
                }
            return mat;
    }
        
}
class Pair{
        int first,second;
        public Pair(int first,int second){
                this.first=first;
                this.second=second;
        }
}
