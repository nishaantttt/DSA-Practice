class Solution {

    public int solve(int i, int[] nums, int[] dp) {
        if (i == 0) return nums[0];
        if (i < 0) return 0;
        if (dp[i] != -1) return dp[i];

        int pick = nums[i] + solve(i - 2, nums, dp);
        int skip = solve(i - 1, nums, dp);

        return dp[i] = Math.max(pick, skip);
    }

    public int robLinear(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return solve(n - 1, nums, dp);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        // Case 1: ignore last house
        int[] case1 = Arrays.copyOfRange(nums, 0, n - 1);

        // Case 2: ignore first house
        int[] case2 = Arrays.copyOfRange(nums, 1, n);

        return Math.max(robLinear(case1), robLinear(case2));
    }
}
