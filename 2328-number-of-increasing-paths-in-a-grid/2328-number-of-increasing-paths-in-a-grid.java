class Solution {
    int mod = 1_000_000_007;

    public int countPaths(int[][] grid) {
        int sum = 0;
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum = (sum + paths(i, j, grid, dp)) % mod;
            }
        }
        return sum;
    }

    public int paths(int i, int j, int[][] grid, int[][] dp) {
        if (dp[i][j] != 0) return dp[i][j];

        int sum1 = 1;

        if (i - 1 >= 0 && grid[i - 1][j] < grid[i][j]) {
            sum1 = (sum1 + paths(i - 1, j, grid, dp)) % mod;
        }
        if (j - 1 >= 0 && grid[i][j - 1] < grid[i][j]) {
            sum1 = (sum1 + paths(i, j - 1, grid, dp)) % mod;
        }
        if (j + 1 < grid[0].length && grid[i][j + 1] < grid[i][j]) {
            sum1 = (sum1 + paths(i, j + 1, grid, dp)) % mod;
        }
        if (i + 1 < grid.length && grid[i + 1][j] < grid[i][j]) {
            sum1 = (sum1 + paths(i + 1, j, grid, dp)) % mod;
        }

        return dp[i][j] = sum1;
    }
}