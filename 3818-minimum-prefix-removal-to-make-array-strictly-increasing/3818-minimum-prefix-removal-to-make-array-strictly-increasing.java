class Solution {
    public int minimumPrefixLength(int[] nums) {
        int ei = nums.length-1;
        while(ei > 0){
            if(nums[ei] > nums[ei-1]){
                ei--;
            }else{
                break;
            }
        }
        return ei;
    }
}