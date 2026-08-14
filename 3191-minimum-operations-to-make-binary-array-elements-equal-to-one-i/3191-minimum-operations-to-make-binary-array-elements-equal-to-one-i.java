class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        int si = 0;
        int ei = si+2;
        while(ei < nums.length){
            if(nums[si] == 0){
                count++;
                nums[si] = 1;
                if(nums[si+1] == 0){
                    nums[si+1] = 1;
                }else{
                    nums[si+1] = 0;
                }if(nums[ei] == 0){
                    nums[ei] = 1;
                }else{
                    nums[ei] = 0;
                }
            }else{
                si++;
                ei++;
            }
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                return -1;
            }
        }
        return count;
    }
}