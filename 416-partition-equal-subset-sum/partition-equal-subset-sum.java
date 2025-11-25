class Solution {
    public static Boolean f(int i, int target, int[] arr,Boolean[][] dp){
        if(target==0) return true;
        if(i==0) return arr[0]==target;
        
        if (dp[i][target] != null) return dp[i][target];
        Boolean notpick = f(i-1,target,arr,dp);
        Boolean pick = false;
        if(target>=arr[i]){
            pick = f(i-1,target-arr[i],arr,dp);
        }
        
        return dp[i][target]=notpick || pick; 
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int target = 0;
        for (int i = 0; i < nums.length; i++) {
            target += nums[i];
        }
        if(target%2!=0){
            return false;
        }
        target/=2;
        Boolean[][] dp = new Boolean[n][target + 1];


        return f(n-1,target,nums,dp);
    }
}