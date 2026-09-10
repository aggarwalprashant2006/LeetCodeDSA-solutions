class Solution {
    static int[] dp;
    public int minCost(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return cost(n);
    }
    public int cost(int n) {
        if(n <= 1){
            return 0;
        }
        if(dp[n] != -1) return dp[n];
        if(n%2 == 0) {
            return dp[n] = cost(n/2)+cost(n/2)+(n/2)*(n/2);
        }
        else {
             return dp[n] = cost(n/2)+cost(n/2+1)+(n/2)*(n/2+1);
        }
    }
}