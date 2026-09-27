class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[][] = new int[nums.length][nums.length+1];
        for(int i =0;i<dp.length;i++){
            for(int j = 0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        return seq(0,-1,nums,dp);
    }
    public int seq(int i ,int prev,int[] nums,int[][] dp){
        if(i == nums.length){
            return 0;
        }
        if(dp[i][prev+1] != -1) return dp[i][prev+1];
        int skip = seq(i+1,prev,nums,dp);
        if(prev != -1 && nums[i] <= nums[prev]) return dp[i][prev+1] = skip;
        int pick = 1+seq(i+1,i,nums,dp);
        return dp[i][prev+1] = Math.max(pick,skip);
    }
}