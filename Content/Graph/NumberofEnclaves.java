class Solution {
        int[][]dir={{1,0},{0,1},{-1,0},{0,-1}};
    public int numEnclaves(int[][] board) {
        for(int i=0;i<board[0].length;i++){
            if(board[0][i]==1)helper(board,0,i);
        }
        for(int i=0;i<board[0].length;i++){
            if(board[board.length-1][i]==1){
                helper(board,board.length-1,i);
            }
        }
        for(int i=0;i<board.length;i++){
            if(board[i][0]==1){
                helper(board,i,0);
            }
        }
        
        for(int i=0;i<board.length;i++){
            if(board[i][board[0].length-1]==1){
                helper(board,i,board[0].length-1);
            }
        }
        int count=0;
        
          for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==1){
                    count+=1;
                }
               
            }
        }
        return count;
        
    }
      public void helper(int[][]board,int row,int col){
        if(row<0||col<0||row>=board.length||col>=board[0].length||board[row][col]==2||board[row][col]==0)return;
        
        board[row][col]=2;
        for(int[]i:dir){
            int nrow=i[0]+row;
            int ncol=i[1]+col;
            
            helper(board,nrow,ncol);
        }
        
    }
}
