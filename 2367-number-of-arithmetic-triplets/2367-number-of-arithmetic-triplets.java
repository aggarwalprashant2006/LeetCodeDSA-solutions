class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        int i =0;
        while(i < nums.length-2){
            int si = i+1;
            int ei = si+1;
            while(ei < nums.length && si < ei){
                if(nums[si] - nums[i] == diff && nums[ei] - nums[si] == diff){
                    count++;
                    ei++;
                }else if(nums[si] - nums[i] == diff && nums[ei] - nums[si] < diff){
                    ei++;
                }else if(nums[si] - nums[i]  == diff &&nums[ei] - nums[si] > diff){
                    si++;
                }else{
                    si++;
                    ei++;
                }
            }
            i++;
        }
        return count;
    }
}