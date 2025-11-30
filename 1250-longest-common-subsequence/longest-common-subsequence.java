class Solution {
    public int f(int i1,int i2 , String s1, String s2,int[][] dp){
        if(i1<0 || i2<0) return 0;

        if(dp[i1][i2] != -1) return dp[i1][i2];

        if(s1.charAt(i1)==s2.charAt(i2)){
         return dp[i1][i2]=1+f(i1-1,i2-1,s1,s2,dp);
        }

        return dp[i1][i2]=Math.max(f(i1,i2-1,s1,s2,dp),f(i1-1,i2,s1,s2,dp));

    }
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m][n];
        for(int i =0 ; i<m ; i++){
            Arrays.fill(dp[i],-1);
        }

        return f(m-1,n-1,text1,text2,dp);
    }
}