class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count =0;
        if(nums.length < 3){
            return 0;
        }
        for(int i =0;i<nums.length-2;i++){
            int si = i+1;
            int ei = si+1;
            int a = nums[si] - nums[i];
            while(ei < nums.length){
                if(nums[ei]-nums[si] == a){
                    count++;
                    si++;
                    ei++;
                }else{
                    break;
                }
            }
        }
        return count;
    }
}