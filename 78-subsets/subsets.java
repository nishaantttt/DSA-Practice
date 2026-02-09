class Solution {
    public void solve(int index, int[] nums, List<Integer> curr, List<List<Integer>> ans) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        // Include
        List<Integer> include = new ArrayList<>(curr);
        include.add(nums[index]);
        solve(index + 1, nums, include, ans);

        // Exclude
        List<Integer> exclude = new ArrayList<>(curr);
        solve(index + 1, nums, exclude, ans);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, nums, new ArrayList<>(), ans);
        return ans;
    }
}
