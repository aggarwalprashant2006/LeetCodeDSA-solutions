class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,1);
        int max = 1;
        for(int i = 1;i<nums.length;i++){
            int max1 = 0;
            for(int j = 0;j<i;j++){
                if(nums[j] < nums[i]){
                    max1 = Math.max(max1,dp[j]);
                }
            }
            dp[i] += max1;
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}