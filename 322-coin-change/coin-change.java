class Solution {
    public int f(int i,int amt,int[] coins, int[][] dp){
        if(i==0){
            if(amt%coins[0]==0) return amt/coins[0];
            else return (int) 1e8;
        }
        if(dp[i][amt]!=-1) return dp[i][amt];

        int notpick = 0+f(i-1,amt,coins,dp);
        int pick = (int) 1e8;
        if(amt>=coins[i]){
            pick = 1+ f(i,amt-coins[i],coins,dp);
        }

        return dp[i][amt] = Math.min(pick,notpick);
    }
    public int coinChange(int[] coins, int amt) {
        int n = coins.length;
        int[][] dp = new int[n][amt+1];
        for(int i = 0 ; i < n ; i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = f(n-1, amt, coins, dp);
        return ans >= 1e8 ? -1 : ans;
    }
}