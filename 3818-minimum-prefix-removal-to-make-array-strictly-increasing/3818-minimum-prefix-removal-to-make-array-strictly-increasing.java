class Solution {
    public int minimumPrefixLength(int[] nums) {
        int ei = nums.length-1;
        int count = 1;
        while(ei > 0){
            if(nums[ei] > nums[ei-1]){
                ei--;
                count++;
            }else{
                break;
            }
        }
        return nums.length-count;
    }
}