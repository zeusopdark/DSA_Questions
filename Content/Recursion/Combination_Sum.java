class Solution {
    List<Integer>ans=new ArrayList<>();
    HashSet<List<Integer>>set;
    List<List<Integer>>main=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        set=new HashSet<>();
        helper(candidates,target,0);
        return main;
    }
    
    public void helper(int[]arr,int target,int index){
        if (index==arr.length)return;
        
        if(target==0){
            if(!set.contains(ans)){
              set.add(new ArrayList<>(ans));
               main.add(new ArrayList<>(ans));
               return;  
            } 
        }
        
        if(target-arr[index]>=0){
            ans.add(arr[index]);
            helper(arr,target-arr[index],index);
            ans.remove(ans.size()-1);
            // helper(arr,target,index+1);
        }
        helper(arr,target,index+1);
    }
}
