class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max1 = 1;
        int max2 = 1;
        int count = 1;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1]){
                count++;
                max1 = Math.max(max1,count);
            }else{
                count = 1;
            }
        }
        count = 1;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                count++;
                max2 = Math.max(max2,count);
            }else{
                count = 1;
            }
        }
        return Math.max(max1,max2);
    }
}