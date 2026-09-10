import java.util.Arrays;

class Solution {
    static int[] dp;
    static int sum;

    public int minCost(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);

        sum = 0;
        sum += cost(n);

        return sum;
    }

    public int cost(int n) {
        if (n <= 1) {
            return 0;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        if (n % 2 == 0) {
            return dp[n] = cost(n / 2)
                         + cost(n / 2)
                         + (n / 2) * (n / 2);
        } else {
            return dp[n] = cost(n / 2)
                         + cost(n / 2 + 1)
                         + (n / 2) * (n / 2 + 1);
        }
    }
}