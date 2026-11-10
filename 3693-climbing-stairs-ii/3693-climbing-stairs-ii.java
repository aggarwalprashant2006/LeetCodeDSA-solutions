class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp = new int[costs.length];
        dp[0] = costs[0]+1;
        if(costs.length >= 2){
            dp[1] = Math.min(dp[0]+costs[1]+1,costs[1]+4);
        } if(costs.length >= 3){
            dp[2] = Math.min(dp[1]+costs[2]+1,Math.min(dp[0]+costs[2]+4,costs[2]+9));
        }
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c = Integer.MAX_VALUE;
        for(int i = 3;i<costs.length;i++){
                a = dp[i-1]+costs[i]+1;
                b = dp[i-2]+costs[i]+4;
                c = dp[i-3]+costs[i]+9;
            dp[i] = Math.min(a,Math.min(b,c));
        }
        return dp[dp.length-1];
    }
}