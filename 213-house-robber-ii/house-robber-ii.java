class Solution {

    private int solve(int[] arr){
        int n = arr.length;
        if(n == 1) return arr[0];

        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for(int i = 2; i < n; i++){
            int pick = arr[i] + dp[i-2];
            int notPick = dp[i-1];
            dp[i] = Math.max(pick, notPick);
        }

        return dp[n-1];
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];

        int[] case1 = Arrays.copyOfRange(nums, 0, n-1);
        int[] case2 = Arrays.copyOfRange(nums, 1, n);

        return Math.max(solve(case1), solve(case2));
    }
}
