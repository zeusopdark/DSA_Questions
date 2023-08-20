class Solution {
    List<List<Integer>>list=new ArrayList<>();
    List<Integer>ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
     helper(0,nums);
    return list;
    }
    
    public void helper(int index,int[]nums){
        if(index==nums.length){
            // for(int i:ans){
            //     System.out.print(i+" ");
            // }
            // System.out.println();
            list.add(new ArrayList<>(ans));
            return;
        }
        
        ans.add(nums[index]);
        helper(index+1,nums);
        ans.remove(ans.size()-1);
        helper(index+1,nums);
    }
}

