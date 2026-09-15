class Solution {
    public int arraySign(int[] nums) {
        int prod = 1;
        for(int i =0;i<nums.length;i++){
            if(nums[i] < 0){
                prod *= -1;
            }else if(nums[i] == 0){
                return 0;
            }
        }
        if(prod > 0){
            return 1;
        }else if(prod < 0){
            return -1;
        }
        return 0;
    }
}