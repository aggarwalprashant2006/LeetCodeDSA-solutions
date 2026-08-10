class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int si = 0;
        int ei = nums.length - 1;
        int i = si+1;
        int j = ei-1;
        while(i <= j){
            if(nums[i] != nums[si] && nums[i] != nums[ei]){
                return nums[i];
            }else if(nums[j] != nums[si] && nums[j] != nums[ei]){
                return nums[j];
            }else{
                i++;
                j--;
            }
        }
        return -1;
    }
}