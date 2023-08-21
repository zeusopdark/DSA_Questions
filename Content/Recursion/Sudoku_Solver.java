class Solution {
      
    public void solveSudoku(char[][] board) {
           solve(board);
    }
        
       private boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (char ch = '1'; ch <= '9'; ch++) {
                        if (isValid(board, row, col, ch)) {
                            board[row][col] = ch;
                            if (solve(board)) {
                                return true;
                            }
                            board[row][col] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true; 
    }
        
        public boolean isValid(char[][]arr,int row,int col,int target){
                
                
                for(int i=0;i<arr[0].length;i++){
                        if(arr[row][i]==target&&i!=col)return false;
                }
                
                for(int i=0;i<arr.length;i++){
                        if(arr[i][col]==target&&i!=row)return false;
                }
                
                int nrow=(row/3)*3;
                int ncol=(col/3)*3;
                
                for(int i=nrow;i<nrow+3;i++){
                        for(int j=ncol;j<ncol+3;j++){
                                if(arr[i][j]==target&&i!=row&&j!=col){
                                        return false;
                                }
                        }
                }
                
                return true;
        }
}
