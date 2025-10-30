class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempset, int[] nums, int target, int start) {
        // ✅ Base condition
        if (target == 0) {
            result.add(new ArrayList<>(tempset));
            return;
        }
        if (target < 0) return; // Prune path if sum exceeds target

        // ✅ Recursive exploration
        for (int i = start; i < nums.length; i++) {
            tempset.add(nums[i]);
            
            // \U0001f501 i (not i+1) because we can reuse same number
            backtrack(result, tempset, nums, target - nums[i], i);

            tempset.remove(tempset.size() - 1);
        }
    }
}
