class Solution {
    public int ans=0;
    public int totalNQueens(int n) {
        
        int chess[][] = new int[n][n];
        worker(chess,n,0);
        return ans;
        
    }
    public void worker(int [][]chess,int n,int r)//globally ans ko declare kiye hain so using void cant use static
    {
        if(r==n)
        {
            ans++;
            //System.out.println("hi");
            return ;
        }
        
        for(int c=0;c<n;c++)
        {
            if(isValid(r,c,chess))
            {
                chess[r][c]=1;
                worker(chess,n,r+1);
                //backtracking here
                chess[r][c]=0;
            }
        }
    }
    
    public boolean isValid(int r,int c,int chess[][])
    {
        for(int i=r-1,j=c;i>=0;i--)
            if(chess[i][j]==1)
                return false;
        for(int i=r-1,j=c-1;i>=0&&j>=0;i--,j--)
            if(chess[i][j]==1)
                return false;
        for(int i=r-1,j=c+1;i>=0&&j<chess.length;i--,j++)
            if(chess[i][j]==1)
                return false;
        return true;
    }
}
