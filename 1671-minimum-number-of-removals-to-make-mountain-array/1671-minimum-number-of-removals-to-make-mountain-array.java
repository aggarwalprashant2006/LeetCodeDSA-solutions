class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int dp1[] = new int[nums.length];
        int dp2[] = new int[nums.length];
        Arrays.fill(dp1,1);
        Arrays.fill(dp2,1);
        for(int i =0;i<nums.length;i++){
            int max = 0;
            for(int j = 0;j<i;j++){
                if(nums[j] < nums[i]){
                    max = Math.max(max,dp1[j]);
                }
            }
            dp1[i] += max;
        }
        for(int i = nums.length-2;i >= 0;i--){
            int max = 0;
            for(int j = nums.length-1;j>i;j--){
                if(nums[j] < nums[i]){
                    max = Math.max(max,dp2[j]);
                }
            }
            dp2[i] += max;
        }
        int max1 = 0;
        for(int i =0;i<dp1.length;i++){
           if (dp1[i] > 1 && dp2[i] > 1) {
                max1 = Math.max(max1, dp1[i] + dp2[i] - 1);
            }
        }
        return nums.length-max1;
    }
}