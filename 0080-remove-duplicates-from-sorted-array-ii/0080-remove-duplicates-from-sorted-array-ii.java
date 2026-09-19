class Solution {
    public int removeDuplicates(int[] nums) {
        int si = 0;
        int ei = si+1;
        int count = 1;
        int i = 0;
        while(ei < nums.length){
            if(nums[si] == nums[ei]){
                if(count < 3){
                    nums[i] = nums[si];
                    i++;
                }
                count++;
                si++;
                ei++;
            }else{
                if(count < 3){
                    nums[i] = nums[si];
                    i++;
                }
                si = ei;
                ei++;
                count = 1;
            }
        }
        if(count < 3){
            nums[i] = nums[nums.length-1];
            i++;
        }
        return i;
    }
}