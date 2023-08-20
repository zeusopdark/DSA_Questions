class Solution {
    List<List<String>>ans=new ArrayList<>();
    List<String>list=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] arr=new char[n][n];
        for(char[]ch:arr){
            Arrays.fill(ch,'.');
        }
        helper(arr,n,0);
        return ans;
    }
    
    public void helper(char[][]arr,int n,int row){
        if(row==n){
            for(int i=0;i<n;i++){
                String res="";
                for(int j=0;j<n;j++){
                    res+=arr[i][j];
                    // System.out.println(res);
                }
                list.add(res);
            }
            ans.add(new ArrayList<>(list));
            list.clear();
            return;
        }
        
        for(int i=0;i<arr.length;i++){
            // System.out.println(i);
            arr[row][i]='Q';
            boolean check=isSafe(arr,row,i);
            if(check){
                helper(arr,n,row+1);
            }
            arr[row][i]='.';
        }
    }
   public boolean isSafe(char[][]arr,int row,int column){
      
       
       for(int i=column-1;i>=0;i--){
           if(arr[row][i]=='Q'){
              return false;
           }
       }
       
       for(int i=row-1;i>=0;i--){
           if(arr[i][column]=='Q'){
              return false;
           }
       }
       
        for(int i=row-1,j=column+1;i>=0&&j<arr.length;i--,j++){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
       
       for(int i=row-1,j=column-1;i>=0&&j>=0;i--,j--){
         if(arr[i][j]=='Q'){
                return false;
            }   
       }
       return true;
  }
}
