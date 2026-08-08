class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k > 0){
            int min = nums[0];
            int a =0;
            for(int i =1;i<nums.length;i++){
                if(min > nums[i]){
                    min = nums[i];
                    a = i;
                }
            }
            nums[a] =  nums[a]*multiplier;
            k--;
        }
        return nums;
    }
}