class Solution {
        HashSet<List<Integer>>set=new HashSet<>();
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
            helper(0,nums);
            return ans;
    }
        
        
        
        public void helper(int index,int[]nums){
           
                if(index==nums.length){
                        if(!set.contains(list)){
                                set.add(list);
                                ans.add(new ArrayList<>(list));
                        }
                        return;
                }
                
                        list.add(nums[index]);
                        helper(index+1,nums);
                        list.remove(list.size()-1);
                        helper(index+1,nums);
                        }
}
