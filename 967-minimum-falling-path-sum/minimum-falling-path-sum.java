class Solution {
    public int f(int i , int j ,int[][] matrix, int[][]dp){
        if (j < 0 || j >= matrix[0].length) return (int)1e9;
        if(i==0) return matrix[0][j];
        if(dp[i][j] != Integer.MAX_VALUE) return dp[i][j];
        int s = matrix[i][j] + f(i-1,j,matrix,dp);
        int ld = matrix[i][j] + f(i-1,j-1,matrix,dp);
        int rd = matrix[i][j] + f(i-1,j+1,matrix,dp);

        return dp[i][j] = Math.min(s,Math.min(ld,rd));
    }
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp=new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        
        int mini=(int)1e8;
        for(int j=0;j<m ; j++){
            mini = Math.min(mini,f(n-1,j,matrix,dp));
        }
        return mini;
    }
}