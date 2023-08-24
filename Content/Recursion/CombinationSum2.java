class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    List<Integer>list=new ArrayList<>();
 
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(candidates,0,target);
        return ans;
    }
    
    
    public void helper(int []nums,int index,int target){
        if(index==nums.length){
            if(target==0){
               
               
                    ans.add(new ArrayList<>(list));
                
            }
            return;
        }
        
        if(target-nums[index]>=0){
            list.add(nums[index]);
            helper(nums,index+1,target-nums[index]);
            list.remove(list.size()-1);
            while(index+1<nums.length && nums[index]==nums[index+1]) index++;   //avoiding the duplicates 
        }
        helper(nums,index+1,target);
    }
}
