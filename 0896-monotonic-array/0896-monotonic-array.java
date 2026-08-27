class Solution {
    public boolean isMonotonic(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1]){
                count1++;
            }else if(nums[i] > nums[i+1]){
                count2++;
            }
            
        }
        if(count1 != 0 && count2 != 0){
            return false;
        }
        return true;
    }
}