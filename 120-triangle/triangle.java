import java.util.*;

class Solution {
    public int f(int i, int j, List<List<Integer>> tri, int n, int[][] dp) {
        // Base Case: If we are at the last row
        if (i == n - 1) {
            return tri.get(i).get(j);
        }

        // Check if we visited this state (Value is NOT the initial flag)
        if (dp[i][j] != Integer.MIN_VALUE) {
            return dp[i][j];
        }

        int val = tri.get(i).get(j);

        // Recursive calls
        int down = f(i + 1, j, tri, n, dp);
        int diag = f(i + 1, j + 1, tri, n, dp);

        // Store the result and return
        return dp[i][j] = val + Math.min(down, diag);
    }

    public int minimumTotal(List<List<Integer>> tri) {
        int n = tri.size();
        int[][] dp = new int[n][n];

        // Initialize the DP table with Integer.MIN_VALUE using loops
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = Integer.MIN_VALUE;
            }
        }

        return f(0, 0, tri, n, dp);
    }
}