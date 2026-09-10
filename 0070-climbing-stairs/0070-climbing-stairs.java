class Solution {
    static int[] dp;
    public int climbStairs(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return Stairs(n,0);
    }
    public int Stairs(int n , int i) {
        if(i > n){
            return 0;
        }if(i == n){
            return 1;
        }
        if(dp[i] != -1) return dp[i];
        return dp[i] = Stairs(n,i+1)+Stairs(n,i+2);
    }
}