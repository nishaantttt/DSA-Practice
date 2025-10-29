class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
      List<List<Integer>> result = new ArrayList<>();
      Arrays.sort(nums);
        backtrack(result,new ArrayList<>(),nums, 0);
        return result;  
    }
    public void backtrack(List<List<Integer>> result,List<Integer> tempset, int[] nums,int start){
        if (result.contains(tempset)) return ;
        result.add(new ArrayList<>(tempset));
        for(int i = start; i <nums.length ; i++){
            tempset.add(nums[i]);            
            backtrack(result,tempset,nums, i+1);

            tempset.remove(tempset.size()-1);
            
        }    
    }
}