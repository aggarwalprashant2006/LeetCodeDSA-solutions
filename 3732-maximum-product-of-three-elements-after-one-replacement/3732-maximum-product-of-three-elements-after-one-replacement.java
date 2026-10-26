class Solution {
    public long maxProduct(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            if(nums[i] < 0){
                nums[i] *= -1;
            }
        }
        Arrays.sort(nums);
        return (long)nums[nums.length-1]*(long)nums[nums.length-2]*(long)Math.pow(10,5);
    }
}