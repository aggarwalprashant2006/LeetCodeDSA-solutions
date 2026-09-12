class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int si = 0;
        int max = 0;
        while(si < nums.length-2){
            int si1 = si+1;
            int ei = si1+1;
            while(ei < nums.length){
                if((nums[si] <= nums[si1] && nums[si1]<= nums[ei]) && nums[si]+nums[si1] > nums[ei]){
                    max = Math.max(max,nums[si]+nums[ei]+nums[si1]);
                    ei++;
                }else{
                    ei++;
                }
                if(ei >= nums.length && si != nums.length-2){
                    si1++;
                }
            }
            si++;
        }
        return max;
    }
}