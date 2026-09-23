class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = 0;
        int max1 = 0;
        int max2 = 0;
        for(int i =0;i<nums.length;i++){
            max1 = Math.max(nums[i],max1+nums[i]);
            max2 = Math.min(nums[i],max2+nums[i]);
            max = Math.max(max,Math.max(max1,Math.abs(max2)));
        }
        return max;
    }
}