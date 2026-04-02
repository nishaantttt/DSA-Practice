class Solution {
    public int totalNQueens(int n) {
        return solve(0, 0, 0, 0, n);
    }

    private int solve(int row, int cols, int diags, int antiDiags, int n) {
        if (row == n) return 1;

        int count = 0;

        // available positions (1 = free)
        int available = ((1 << n) - 1) & ~(cols | diags | antiDiags);

        while (available != 0) {
            int position = available & -available; // pick rightmost 1
            available -= position;

            count += solve(
                row + 1,
                cols | position,
                (diags | position) << 1,
                (antiDiags | position) >> 1,
                n
            );
        }

        return count;
    }
}