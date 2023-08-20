
class Solution {
    static ArrayList<String> findpath(ArrayList<String> ans,int[][]mat,boolean[][] visited,int r,int c,String psf){
        
        if(r<0 || c<0|| r == mat.length || c == mat.length || mat[r][c] == 0|| visited[r][c] == true){
            
            return ans;
        }
        if(r == mat.length-1 && c == mat.length -1){
            ans.add(psf);
            return ans;
        }
        visited[r][c] = true;
        findpath(ans,mat,visited,r-1,c,psf+"U");
        findpath(ans,mat,visited,r+1,c,psf+"D");
        findpath(ans,mat,visited,r,c-1,psf+"L");
        findpath(ans,mat,visited,r,c+1,psf+"R");
        visited[r][c] = false;
        
        return ans;
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        
        return findpath(ans,m,visited,0,0,"");
    }
}
